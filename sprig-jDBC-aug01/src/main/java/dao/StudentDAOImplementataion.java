package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import model.StudentField;

public class StudentDAOImplementataion implements StudentDAO {
	private JdbcTemplate jdbctemp;
	private RowMapper<StudentField> rowMap;

	private String INSERT = "insert into student values(?,?,?,?)";
	private String UPDATE = "update student set first_number=?,last_number=?,phoneNo=? where roll_number=?";
	private String ALLDELETE = "delete from student";
	private String SELECTALL = "select * from student";
	private String oneSelect = "select * from student where roll_number=?";
	private String oneDelete = "delete from student where roll_number=?";

	public StudentDAOImplementataion() {
		super();
	}

	public StudentDAOImplementataion(DataSource datasource) {
		jdbctemp = new JdbcTemplate(datasource);
	}

	public void setDataSource(DataSource datasource) {
		jdbctemp = new JdbcTemplate(datasource);
	}

	public void setRowMap(RowMapper<StudentField> rowMap) {
		this.rowMap = rowMap;
	}

	@Override
	public void updateRecord(StudentField st) {
		jdbctemp.update(UPDATE, st.getRoll_number(), st.getFirst_Name(), st.getLast_Name(), st.getPhoneNo());
	}

	@Override
	public void insertRecord(StudentField st) {
		jdbctemp.update(INSERT, st.getRoll_number(), st.getFirst_Name(), st.getLast_Name(), st.getPhoneNo());

	}

	@Override
	public void deleteAllRecord() {
		jdbctemp.update(ALLDELETE);
	}

	@Override
	public void deleteRecord(Integer rollNumber) {
		jdbctemp.update(oneDelete, rollNumber);

	}

	@Override
	public StudentField getOneStudentRecord(Integer rollNumber) {
		@SuppressWarnings("deprecation")
		List<StudentField> studentFields=jdbctemp.query(oneSelect, new Object[] {rollNumber}, new StudentRowMapper());
		return studentFields.get(0);
	}

	@Override
	public List<StudentField> getAllRecord() {
		List<StudentField> studentFields=jdbctemp.query(SELECTALL, new StudentRowMapper());
		return studentFields;
	}

}
