package com.IO;
//  		c. Write a program to search for a string in a file and then return the count of number of occurrences of the string.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringOccurance {
	
static BufferedReader br;
static String search="write";
static String line="";
static int count=0;
static void countoccurance(){
	try {
		br=new BufferedReader(new FileReader("//Users//mns//Desktop//Innovapath//programlist.txt"));
	while((line=br.readLine()) != null){
		String[]words=line.split(" ");
		for(String s:words){
			if(s.equalsIgnoreCase(search))		
			count++;				
		}
	}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("the no.of occurances for word-write:  "+count);
}
	public static void main(String[] args) {

StringOccurance.countoccurance();
	}

}
