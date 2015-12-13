package com.main;

public class ConstructorOverload {
	int id;
	String password;
	int age;
	public  ConstructorOverload() {
	}
public  ConstructorOverload(int i,String s) {
		id=i;
		password=s;		
	}
	public  ConstructorOverload(int i,String s,int a) {
		id=i;
		password=s;		
		age=a;
	}
	public void printsome(){
		System.out.println(" id "+id + " password "+password + " age "+age);
	}
	public static void main(String[] args) {
ConstructorOverload cd=new ConstructorOverload();
ConstructorOverload cd1=new ConstructorOverload(2, "keya");
ConstructorOverload cd2=new ConstructorOverload(4, "mrinal",3);
cd.printsome();
cd1.printsome();
cd2.printsome();
	}
}
