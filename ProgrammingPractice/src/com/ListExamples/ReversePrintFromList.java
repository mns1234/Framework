package com.ListExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReversePrintFromList {
	static void accessElements(ArrayList<String> list){
		{
			ListIterator<String> it= list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			while(it.hasPrevious())
			{
				System.out.println(it.previous());
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Bob");
		alist.add("Bob");
		alist.add("Ban");
		alist.add("boss");
		alist.add("Big");
		alist.add("Bold");
	accessElements(alist);
		
	}

}
