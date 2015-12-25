package com.main;
//methodoverridingexample
//public int getAge()should be same for parent & child class

public class Children {
	
	public void addno(){
		System.out.println("this is public method");
	}
	protected void addno1(){
		System.out.println("this is protected method");
	}
	private void addno2(){
		System.out.println("this is private method");
	}
	//default
	void addno3(){
		System.out.println("this is default method");
	}
	
public int getAge(){
	return 0;	 
	}
public void getplay(){
	
}
}

