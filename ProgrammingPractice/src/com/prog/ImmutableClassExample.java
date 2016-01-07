package com.prog;
//Write an immutable class
public final class ImmutableClassExample {

 final int id;
 final String name;
 final String department;
 
public ImmutableClassExample (int id,String name,String department){
	this.id=id;
	this.name=name;
	this.department=department;
	}
public int getid(){
	return id;
	
}
public String getname(){
	return name;
}
public String getdepartment(){
	return department;
}
public static void main(String[] args) {
	ImmutableClassExample ic=new ImmutableClassExample(02, "bob", "Accounts");
	System.out.println(ic.getid());
	System.out.println(ic.getdepartment());
	System.out.println(ic.getname());
}
}
