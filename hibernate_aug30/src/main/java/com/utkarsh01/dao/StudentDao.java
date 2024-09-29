package com.utkarsh01.dao;

import com.utkarsh01.entity.Student;

public interface StudentDao {
	
	public void getAllStudentRecords(Student st);
	
	public void updateRecord(Student st);
	
	public void deleteRecord(Long id);
	
	public Student getOneStudentRecord(Long id);
	
}
