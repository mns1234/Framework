package com.main;
//		d. Write a program to depict the behavior of method overloading and overriding.
public class Methodoverload {	
	int sum;
	int a;
	int b;
	int c;
	public int findsum(){
		a=10;
		b=20;
		c=1;
		int sum=a+b+c;
		return sum;		
	}
	public int findsum( int a,int b){		
		return a+b;		
	}
	public int findsum(int a, int b, int c){			
		return a+b+c;		
	}
	public static void main(String[] args) {
  Methodoverload add=new Methodoverload();
  int val1= add.findsum();
  int val2= add.findsum(5, 4);
  int val3= add.findsum(3, 3, 4);
  System.out.println(val1+" "+val2+" "+val3);
	}
}
