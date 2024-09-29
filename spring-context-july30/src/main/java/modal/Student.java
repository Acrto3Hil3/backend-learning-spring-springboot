package modal;

/**
 * 
 */
public class Student {
	private int rollNumber;
	private String fName;
	private String lName;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getFNAME() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName=fName;
	}
	public String geLNAME() {
		return lName;
	}
	public void setLName(String lName) {
		this.lName=lName;
	}
	
	public Student() {}
	public Student(int rollNumber, String fName, String lName) {
		super();
		this.rollNumber = rollNumber;
		this.fName = fName;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", fName=" + fName + ", lName=" + lName + "]";
	}
	
	
	
}
