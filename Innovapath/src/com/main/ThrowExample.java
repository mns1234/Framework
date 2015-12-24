package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowExample {
	/*public static void checkage(int age){
		if(age<18)
			throw new ArithmeticException();
		else{
			System.out.println("the age is fine");
		}
	}*/
public static void checage(int age)throws FileNotFoundException,NullPointerException, ArithmeticException
{
	if (age<16){
		FileReader io= new FileReader("");
	}
	else{
		System.out.println("fine");
	}
}
	public static void main(String[] args){
		try{
		//ThrowExample.checkage(17);
			ThrowExample.checage(15);
		}
		catch(ArithmeticException e)
		{System.out.println("The error came");} 
		catch 
		(FileNotFoundException e) {
		
			System.out.println("OMG");
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
			
		}
		
		}
	
	}


