package com.prog;
/* e. Write a program that contains a constructor, a static block and a
static method.Execute the program in order to verify the order to execution 
of methods and block.*/

public class TryStatic {
	static int firstnum;
	static int secondnum;
	static int i=10;
	
	static{
		System.out.println("this is static program.");
	}
	
	public TryStatic(){
	i=i+1;
	System.out.println("the value is "+ i);
	}
	
	public static void sum(int firstnum, int secondnum){
		
		
		int sum=firstnum+secondnum;
		System.out.println("the sum is: "+sum);
	}
	public static void main(String[] args) {
		TryStatic tryo=new TryStatic();
				tryo.sum(3,5);
	}

}
