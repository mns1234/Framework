package com.ListExamples;

import java.util.ArrayList;
import java.util.Iterator;
//. Write a program to copy arraylist to an array.
//explicitly call garbage collector
public class CopyArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<>();
		list.add("Bob");
		list.add("Ban");
		list.add("boss");
		list.add("Big");
		list.add("Bold");
		System.out.println((list));
		String[]arr=new String[list.size()];
		list.toArray(arr);
		for
		(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.gc();//explicitly call garbage collector
		
	}

}
