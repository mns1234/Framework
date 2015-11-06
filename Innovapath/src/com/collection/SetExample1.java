package com.collection;

import java.util.HashSet;

public class SetExample1{//removing duplicates from an array
	
	static void removeArray()
{     int[] arr={10,12,13,15,2,12 };
		HashSet<Integer>mySet=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{			
			mySet.add(arr[i]);
		}
		for(Integer integer:mySet)
		{
			System.out.println("The elements were "+ integer);
		}
	}
public static void main(String[] args) {	
	SetExample1.removeArray();		
	}

}