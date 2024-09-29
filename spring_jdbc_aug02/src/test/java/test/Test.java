package test;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAO;
import model.StudentField;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Scanner sc=new Scanner(System.in);
		int choice;
		StudentDAO dao1 = (StudentDAO) ctx.getBean("dao");
//		System.out.println(dao1.toString());
	
		System.out.println("Press 1 for insert value in table\n"
				+ "Press 2 for update the student record in table\n"
				+ "Press 3 for delete the student based on roll NO\n"
				+ "Press 4 to view the record based on roll No\n"
				+ "Press 5 to view all the record in table\n"
				+ "Press 6 for delete all the record in table\n");
		
		switch(choice=Integer.parseInt(sc.nextLine())) {
		
		
		case 1: 
			try {
				System.out.println("Enter RollNo ");
				int rollNo=Integer.parseInt(sc.nextLine());
				System.out.println("enter first name ");
				String fName=sc.nextLine();
				System.out.println("enter the lastname");
				String lName=sc.nextLine();
				System.out.println("enter the Phone Number");
				long phno=sc.nextLong();
				StudentField obj=new StudentField(rollNo,fName,lName,phno);
				dao1.insertRecord(obj);
				System.out.println("Successfully insert..");
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			try {
				System.out.println("Enter RollNo ");
				int rollNo=Integer.parseInt(sc.nextLine());
				System.out.println("enter first name ");
				String fName=sc.nextLine();
				System.out.println("enter the lastname");
				String lName=sc.nextLine();
				System.out.println("enter the Phone Number");
				long phno=sc.nextLong();
				StudentField obj=new StudentField(rollNo,fName,lName,phno);
				dao1.updateRecord(obj);
				System.out.println("updated..");
			} catch(Exception e){
				e.printStackTrace();
			}
			break;
		case 3:
			try {
			StudentField obj=new StudentField();
			System.out.println("Enter the roll No");
			int rollno=Integer.parseInt(sc.nextLine());
			dao1.deleteRecord(rollno);
			System.out.println(" ROw deleted ..");
			} catch(Exception e) {
				System.out.println("unable to delete a row");
			}
			break;
			
		case 4:
			try {
			
			System.out.println("Enter the roll No");
			int rollno=Integer.parseInt(sc.nextLine());
			StudentField obj=dao1.getOneStudentRecord(rollno);
			System.out.println(obj);
			System.out.println("Record displayed");
			} catch(Exception e) {
				e.printStackTrace();				System.out.println("row record not fetched");
			}
			break;
		case 5:
			try {
				List<StudentField> ls=dao1.getAllRecord();
				for(StudentField s:ls) {
					System.out.println(s);
				}
				System.out.println("All record displayed");
				System.out.println();
			}catch(Exception e) {
				System.out.println("Unable to fetch table");
				e.printStackTrace();
			}
			break;
		case 6 :
			try {
				StudentField obj=new StudentField();
				dao1.deleteAllRecord();
				System.out.println("Successfully Delete the table..");
			} catch(Exception e) {
				System.out.println("Unable to delte table");
			}
			break;
		default:
			System.out.println("Choose from given option");
		}
		

	}

}
