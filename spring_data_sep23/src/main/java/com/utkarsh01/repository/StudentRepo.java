package com.utkarsh01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh01.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	List<Student> findByMarks(Double marks);
	List<Student> findByNameAndMarks(String name,Double marks);

	@Query("select s from Student s where s.marks<=50")
	public List<Student> getLessMarkstLess();
	
	@Query("select s from Student s where s.marks<=:marks")
	public List<Student> getMarksWithParams(@Param("marks") Double marks);
	
	@Query(value =  "select * from student04 where marks>30",nativeQuery = true)
	public List<Student> getMarksNativeSQL();
	
	@Query("select max(marks) from  Student")
	public Double getMaxMarks();

}
