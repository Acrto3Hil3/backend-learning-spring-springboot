package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import model.EmployeeDetails;

public class EmployeeDAOImp implements EmployeeDAO {
	
	private JdbcTemplate jdbcTemp;
	
	
	private String INSERT="insert into employee values(?,?,?,?) ";
	
	private String UPDATE="update employee set eName=?,eDesg=?,eSal=? where empId=?";
	
	private String DELETE="delete from employee where empId=?";
	
	private String GET_ONE="select * from employee where empId=?";
	
	private String GET_ALL="select * from employee";
	
	private String DELETE_ALL="delete from employee";
	
	private RowMapper<EmployeeDetails> rowMap;
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemp=new JdbcTemplate(dataSource);
	}
	
	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}
	
	public void setRowMap(RowMapper<EmployeeDetails> rowMap) {
		this.rowMap = rowMap;
	}
	
 
	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void insertDetails(EmployeeDetails emp) {
		jdbcTemp.update(INSERT, emp.getEmpId(),emp.getEName(),emp.getEDesg(),emp.getESal());
	}


	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateDetails(EmployeeDetails emp) {
		jdbcTemp.update(UPDATE,emp.getEName(),emp.getEDesg(),emp.getESal(),emp.getESal());
		
	}


	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deleteDetails(String empId) {
		jdbcTemp.update(DELETE,empId);
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public EmployeeDetails fetchDetails(String empId) {
		
		List<EmployeeDetails> emp= jdbcTemp.query(GET_ONE, new Object[]{empId}, rowMap);
		return emp.get(0);
	}

	@Override
	public List<EmployeeDetails> fetchAll() {
		List<EmployeeDetails> emp=jdbcTemp.query(GET_ALL, rowMap);
		return emp;
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deleteAll() {
		jdbcTemp.update(DELETE_ALL);
	}



}
