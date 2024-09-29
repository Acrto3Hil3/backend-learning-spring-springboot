package dao;

import java.util.List;

import model.StudentField;

public interface StudentDAO {
	
	public void insertRecord(StudentField  st);

	public void updateRecord(StudentField  st);
	
	public void deleteRecord(Integer rollNumber);
	
	public void deleteAllRecord();
	
	public StudentField getOneStudentRecord(Integer rollNumber);
	
	public List<StudentField> getAllRecord();
}
