package com.collection1;

import java.util.Iterator;

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String>list= new LinkedList<>();
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