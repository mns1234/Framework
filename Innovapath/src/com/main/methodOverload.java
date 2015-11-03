package com.main;

public class methodOverload {
	
	public String name;
	public int id;
	
	public void printempDet()
	{
		System.out.println("emp.id is"+id+"name is "+name);
	}
	public methodOverload()
	{
		name="no name";
		id=0;
	}
	public methodOverload(String good,int ii)//init or parameterized constructor
	{
		name= good;
		id=ii;
	}
	public methodOverload(String good)
	{
		name= good;
	}	
}

