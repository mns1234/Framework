package Practice;

public class EmployeeInheritance extends personInheritance{

	
int salary;

EmployeeInheritance(){
}
EmployeeInheritance(String fname, String lname,int salary){
	super (fname, lname);
	this.salary=salary;
	
}
public String concate(String fname, String lname,int salary){
	super.concate(fname, lname);
	String s=super.firstname;
	String details="hey you"+fname+lname+"your salary is:"+salary;
	return details;
}

	
}

	

		
	

