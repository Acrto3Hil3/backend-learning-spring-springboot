package test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDAO;
import model.EmployeeDetails;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDAO dao1 = (EmployeeDAO) ctx.getBean("daoImpl");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 for insert value in table\n" + "Press 2 for update the student record in table\n"
				+ "Press 3 for delete the student based on roll NO\n" + "Press 4 to view the record based on roll No\n"
				+ "Press 5 to view all the record in table\n" + "Press 6 for delete all the record in table\n");

		System.out.println("Enter your choice");
		int choice;
		switch (choice = Integer.parseInt(sc.nextLine())) {

		case 1:
			try {
				System.out.println("Enter Employee id ");
				String empId =sc.nextLine();
				System.out.println("enter Employee name ");
				String eName = sc.nextLine();
				System.out.println("enter Employee Desg");
				String eDesg = sc.nextLine();
				System.out.println("enter Employee Sal");
				long eSal = sc.nextLong();
				EmployeeDetails obj = new EmployeeDetails(empId,eName,eDesg,eSal);
				dao1.insertDetails(obj);
				System.out.println("Successfully insert..");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;

		case 2:
			try {
				System.out.println("Enter Employee id ");
				String empId =sc.nextLine();
				System.out.println("enter Employee name ");
				String eName = sc.nextLine();
				System.out.println("enter Employee Desg");
				String eDesg = sc.nextLine();
				System.out.println("enter Employee Sal");
				long eSal = sc.nextLong();
				EmployeeDetails obj = new EmployeeDetails(empId,eName,eDesg,eSal);
				dao1.updateDetails(obj);
				System.out.println("updated..");
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				EmployeeDetails obj = new EmployeeDetails();
				System.out.println("Enter Employee id");
				String empId=sc.nextLine();
				dao1.deleteDetails(empId);
				System.out.println(" ROw deleted ..");
			} catch (Exception e) {
				System.out.println("unable to delete a row");
			}
			break;

		case 4:
			try {
				System.out.println("Enter Employee id");
				String empId=sc.nextLine();
				EmployeeDetails obj = dao1.fetchDetails(empId);
				System.out.println(obj);
				System.out.println("Record displayed");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("row record not fetched");
			}
			break;
		case 5:
			try {
				List<EmployeeDetails> ls = dao1.fetchAll();
				for (EmployeeDetails emp : ls) {
					System.out.println(emp);
				}
				System.out.println("All record displayed");
				System.out.println();
			} catch (Exception e) {
				System.out.println("Unable to fetch table");
				e.printStackTrace();
			}
			break;
		case 6:
			try {
				EmployeeDetails obj = new EmployeeDetails();
				dao1.deleteAll();
				System.out.println("Successfully Delete the table..");
			} catch (Exception e) {
				System.out.println("Unable to delte table");
			}
			break;
		default:
			System.out.println("Choose from given option");
		}

	}

}
