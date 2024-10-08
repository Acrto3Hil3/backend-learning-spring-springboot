package com.utkarsh01.constant;

public class EmpQuery {
	public static final String GET_ALL="select * from employee01";
	public static final String GET_ONE="select * from employee01 where id=?";
	public static final String INSERT="insert into employee01(name,position,salary) values(?,?,?)";
	public static final String UPDATE="update employee01 set name=?,position=?,salary=? where id=?";
	public static final String DELETE="delete from employee01 where id=?";
}
