package com.utkarsh01.constant;

public class QueriesConstant {
	
	public static final String GET_ALL="select * from employee04";
	
	public static final String DELETE="delete from employee04 where id=?";
	
	public static final String INSERT="insert into employee04(firstName,lastName,address,mobile,salary) values(?,?,?,?,?)";
	
	public static final String UPDATE="update employee04 set into firstName=?,lastName=?,address=?,mobile=?,salary=? where id=?"
			;
	public static final String GET_ONE="select * from employee04 where id=?";
	
}
