package model;

public class Student {
	private int id;
	private String name;
	private String department;
	
	public Student() {
		
	}
	public Student(String name, String department){
		this.name = name;
		this.department = department;
	}
	public Student(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department= department;
	}
	public void setId() {
		this.id = id;
	}
	public void setName() {
		this.name = name;
	}
	public void setDepartment() {
		this.department = department;
	}
	
	public int getId()
	{
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getDepartment() {
		return this.department;
	}
	
	public String toString() {
		return this.id + " "  + this.name + " " + this.department;
	}
	
	
	
}
