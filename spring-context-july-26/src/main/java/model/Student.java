package model;

public class Student {
	private String firstName;
	private String lastName;
	private String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	public Student() {
		super();
	}
	public Student(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	} 
	public Student( String address) {
		
		this.address = address;
	} 
	public Student( Student st) {
		
		this.firstName=st.firstName;
	} 
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	} 
	
}
