package com.prog;
//d. Write a program  to calculate factorial of a given number. You need to compute 
//the factorial with one logic that uses recursion and another logic without recursion.

public class Factorial {	
	public static int factorial1(int j){
		if(j==1)
			return 1;
		else
			return j*factorial1(j-1);
	}
	public static void main(String[] args) {
		int i=5;
		Factorial f1 = new Factorial();
		int x = f1.factorial1(i);
		System.out.println(x);
	}
}
