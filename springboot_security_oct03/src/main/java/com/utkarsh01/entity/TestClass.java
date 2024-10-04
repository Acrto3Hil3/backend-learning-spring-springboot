package com.utkarsh01.entity;

public class TestClass {
	public static void main(String[] args) {
		Student s=Student.builder()
						.id(1)
						.name("Ramu)")
						.marks(85.2f)
						.build();
		System.out.println(s);
	}
}
