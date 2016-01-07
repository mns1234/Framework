package com.ListExamples;

import java.util.HashSet;

public class DuplicatesPresentInSet {

	public static void main(String[] args) {
		
		String[] arr={"Bob","Bob","Bull","cat","dog"};
		HashSet<String> mySet=new HashSet<>();
		for
		(String s: arr)
		{
			if(!mySet.add(s))
			{
			System.out.println("the duplicate element is "+s);	
			}
		}
	}

}
