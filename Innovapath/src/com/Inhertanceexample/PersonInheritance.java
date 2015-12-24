package com.Inhertanceexample;

public class PersonInheritance {
	String firstname;
	String Lastname;
	PersonInheritance(){
		
	}
	
	PersonInheritance(String fname,String lname){
		this.firstname=fname;
		this.Lastname=lname;
	}

	public void fullname(){
		String full=firstname+Lastname;
	}

}
