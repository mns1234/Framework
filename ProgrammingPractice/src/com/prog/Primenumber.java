package com.prog;

public class Primenumber {
	public boolean primeno(int num){
		for 
		(int i=2;i<=num/2;i++){
			if(num%i==0){
				return false;
			}
			 
		}
		return true;
				
	}
			
	
	public static void main(String[] args) {
Primenumber pm= new Primenumber();
System.out.println("the given no. is prime: "+pm.primeno(7));

	}

}
