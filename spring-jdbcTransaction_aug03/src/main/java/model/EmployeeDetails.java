package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
	private String empId;
	private String eName;
	private String eDesg;
	private long eSal;

}
