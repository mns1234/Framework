package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//		--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
public class BufferedReaderExample{
	static void subtraction(){
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(reader);
	BufferedReader br1 = new BufferedReader(reader);
	
	try {
		System.out.println("enter no1:");
		int i = Integer.parseInt(br.readLine());
		System.out.println("enter no2:");	
		int i1 = Integer.parseInt(br1.readLine());
		
	System.out.println("the subtraction of 2 no. is "+(i-i1));
	}catch(IOException e){
		e.printStackTrace();
	}
finally{
	try {
		br.close();
		br1.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
	}
	

public static void main(String[] args) {

subtraction();
	

}
}