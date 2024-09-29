package com.utkarsh01.dao;

import com.utkarsh01.entity.StudentRecord;

public interface StudentDao {
	
	public void storeRecord(StudentRecord st);
	
	public void updateRecord(StudentRecord st);
	
	public StudentRecord getOneRecord(Integer id);
	
	public void deleteRecord(Integer id);

}
