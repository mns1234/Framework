package com.main;

public class FindFactorial {
	
	public int factorial(int num){
		int fact=num;
		for(int i=num-1;i>1;i--)
		{
			fact=fact*i;
		}		
		return fact;		
	}
	public static void main(String[] args) {
		FindFactorial fact= new FindFactorial();
		int val=fact.factorial(5);
		System.out.println("the factorial "+val);
	}
}
