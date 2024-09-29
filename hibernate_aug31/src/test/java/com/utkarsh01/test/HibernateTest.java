package com.utkarsh01.test;

import com.utkarsh01.dao.BookDao;
import com.utkarsh01.dao.BookDaoImpl;
import com.utkarsh01.entity.Library;

public class HibernateTest {

	public static void main(String[] args) {
		
		BookDao dao=new BookDaoImpl();
		
//		Library lb=new Library("Python", "Ritchie", "English", 4, 1800d);
//		dao.addBook(lb);
//		System.out.println(lb);
//		System.out.println("Book is added");
		
		
	  /* Library lb=dao.viewBook(2);
		* System.out.println(lb);
		* lb.setBookName("Java");
		* lb.setBookAuthor("James Gosling");
		* lb.setBookPrice(9000d);
		* lb.setBookQuantity(4);
		* lb.setMedium("German");
		* dao.updateBookDetails(lb);
		* lb=dao.viewBook(2);
		* System.out.println(lb);
		*  System.out.println("Book is updated..");
		*/

//		dao.deleteBook(3);
//		System.out.println("Book deleted..");
		
//		for(Library lb:dao.allBookDetails()) {
//			System.out.println(lb);
//		}
		
//		for(Library lb:dao.booksBySqlQuery()) {
//			System.out.println(lb);
//		}
		
//		for(Library lb:dao.basedOnPrice(9000d)) {
//			System.out.println(lb);
//		}
		
		
//		System.out.println("No fo books in library :" + dao.noOfBooks());
		
		
//		
//		System.out.println("Max price amoung all books :" +dao.maxPriceBook());
		
//		for(Library lb:dao.booksBySqlQuery()) {
//			System.out.println(lb);
//		}
		
	
//		for(Library lb:dao.priceBySql(1800d)) {
//			System.out.println(lb);
//		}
		
//		for(Object[] obj:dao.allBooksWithAttribute_Hql()) {
//			System.out.println(obj[0]+"\t"+obj[1]);
//		}
		
		for(Object[] obj:dao.allBooksWIthAttribute_Sql()) {
			System.out.println(obj[0]+"\t"+obj[1]+"\t"+obj[2]+"\t"+obj[3]);
		}
		
	}

}
