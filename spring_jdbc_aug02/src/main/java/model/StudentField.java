package model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor

@RequiredArgsConstructor
public class StudentField {
	private int roll_number;
	private String first_Name;
	private String last_Name;
	private long phoneNo;
}
