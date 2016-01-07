package com.IO;
//Write a program to search for a string in a file and then replace it with another string.
//???what function can i use in line 20 to replace one string with other,replaceAll or replace is not working					
			
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReplaceAString {
static FileReader fl;
static BufferedReader br;
static String original="search";
static String replaced="count";
static String s=null;
	static void replace(){
		try {
			fl=new FileReader("//Users//mns//Desktop//Innovapath//programlist.txt");
			br=new BufferedReader(fl);			
			while((s=br.readLine())!=null){
				s.replace(original, replaced);				
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
	public static void main(String[] args) {
		ReplaceAString.replace();	
		}
	}


