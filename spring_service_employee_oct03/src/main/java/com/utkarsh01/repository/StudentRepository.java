package com.utkarsh01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh01.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>   {

}
