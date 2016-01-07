package com.ListExamples;
/*  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.*/

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListExample {
	
public static void main(String[] args) {
	ArrayList<String>list= new ArrayList<>();
	list.add("Bob");
	list.add("Ban");
	list.add("boss");
	list.add("Big");
	list.add("Bold");
	
	String s1=list.get(1);
	System.out.println("the 2nd element is"+s1);
	/*for
	(String s:list)
	{
		System.out.println(s);
	}*/
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		String s=it.next();
		System.out.println("The list is "+s);
		
		
	
	}
}
}