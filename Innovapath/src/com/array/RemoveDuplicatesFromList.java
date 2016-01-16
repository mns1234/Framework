package com.array;

import java.util.ArrayList;
import java.util.HashSet;

//convert list int hashset to removre duplicate & add it back
public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		HashSet<Integer>myset=new HashSet<>();
		list.add(10);
		list.add(10);
		list.add(3);
		list.add(38);
		list.add(38);
		list.add(9);
		list.add(6);
		for(Integer i:list)
		{
			System.out.println("Before  "+i);
		}
		myset.addAll(list);
		list.clear();//to empty current list
		list.addAll(myset);
		for(Integer i:myset)
		{
			System.out.println("After  "+i);
		}
	}
	

}
