package com.ListExamples;
import java.util.Iterator;

import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String>list= new ArrayList<>();
	list.add("Bob");
	list.add("Ban");
	list.add("boss");
	/*for
	(String s:list)
	{
		System.out.println(s);
	}*/
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		String s=it.next();
		System.out.println(s);
	}
}
}