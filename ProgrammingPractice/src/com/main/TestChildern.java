package com.main;

public class TestChildern {

	public static void main(String[] args) {
/*Boys c=new Boys();
int t=c.getAge();
System.out.println(t);

Girls d=new Girls();
int e=d.getAge();
System.out.println(e);*/
		
		Children c=new Boys();//upcasting
		System.out.println("Boys  "+c.getAge());
		Children d=new Girls();
		System.out.println("Girls  "+d.getAge());
		
		Children f=new Children();
		f.addno3();
		
	}

}
