package com.Inhertanceexample;

public class EmployeeInheritance extends PersonInheritance{
int salary;
	public EmployeeInheritance() {
	}
	public EmployeeInheritance(String fname,String lname, int salary){
		super(fname,lname);
		this.salary=salary;
	}
	public String Concat(String fname,String lname, int salary){
		super.fullname();
		String details=fname+lname+salary;
		return details;
			
	}
}
