package com.utkarsh01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.utkarsh01.entity.Address;
import com.utkarsh01.entity.Book;
import com.utkarsh01.entity.Student;
import com.utkarsh01.repository.StudentRepository;

@SpringBootApplication
public class SpringbootDataRelationSep26Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataRelationSep26Application.class, args);
	}
	
	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Student st=new Student("Rajesh",887752965l);
		
		Address address=new Address("Panjaguta","Telanagana");
		Book book1=new Book("UI/UX");
		Book book2=new Book("Azure");
		st.setAddress(address);
		st.getBooks().add(book1);
		st.getBooks().add(book2);
		st=repository.save(st);
		System.out.println(st);
	}
	
	

}
