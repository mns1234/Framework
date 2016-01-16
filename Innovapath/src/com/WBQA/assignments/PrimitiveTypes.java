package com.WBQA.assignments;

public class PrimitiveTypes {
//Write me a class with main method which will show all primitive data types and print them.
	public int n;
	public double m;
	public String st;
	public String st1;
	public static boolean b;
	public char c;
	public char d;
	
	public static double add(double m, int n){
		double s=m+n;
		System.out.println("the no is :"+s);
		 return s;		
	}
	public static String concat(String st, String st1)
	{
		String st2=st.concat(st1);
		System.out.println("the concat is :"+ st2);
		return st2;
	}
	public static boolean sayit(){
		b=false;
		if(5==(50/10))
		{
			b=true;		
		}
		System.out.println("It is "+b);
		return b;
	}
	
	public static void main(String[] args) {
add(3.5,4);
concat("hi ","Maya");
sayit();
	}
}
