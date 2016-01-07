package com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) throws IOException {
FileReader fl=new FileReader("//Users//mns//Desktop//Innovapath//programlist.txt");
BufferedReader bf=new BufferedReader(fl);
String s=bf.readLine();
int count=0;
while (s !=null){
	String[]words=s.split(" ");
	for(String st: words){
		count++;
	}
	 s = bf.readLine();
}
System.out.println(count);
	}

}
