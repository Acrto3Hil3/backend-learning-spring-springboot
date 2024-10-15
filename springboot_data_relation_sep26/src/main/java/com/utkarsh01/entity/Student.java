package com.utkarsh01.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jpa_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	
	private String stuName;
	private Long phoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "address_id")
	@JoinTable(name = "student_id", joinColumns = @JoinColumn(name="stu_id"), inverseJoinColumns = @JoinColumn(name="address_id"))
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_book", joinColumns = @JoinColumn(name="stu_id"),inverseJoinColumns = @JoinColumn(name="book_id"))
	private List<Book> books=new ArrayList<>();
	
	public Student(String stuName, Long phoneNumber) {
		this.stuName = stuName;
		this.phoneNumber = phoneNumber;
	}
	
	
}
