package com.array;

import java.util.HashSet;
import java.util.Iterator;
//no duplicates, allows null, no insertion order
public class SetExample {
public static void main(String[] args) {
	HashSet<String> mySet= new HashSet<>();
	mySet.add("did");
	mySet.add("bib");
	mySet.add("sis");
	mySet.add("kik");
	mySet.add("kik");
	mySet.add(null);
//	
//	for(String s:mySet)
//	{
//		System.out.println(s);
//	}
	Iterator<String> it=mySet.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
