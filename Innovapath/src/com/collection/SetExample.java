package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	//create a set
	static void createSet(){
		HashSet<String>mySet=new HashSet<>();
		mySet.add("Keya");
		mySet.add("Keya");
		mySet.add("Laya");
		mySet.add("Piyaa");
	accessElements(mySet);
	}
	static void accessElements(HashSet<String>set){
		Iterator itr=set.iterator();
	while(itr.hasNext()){
		System.out.println("the names are "+itr.next());
	}
	}
	//remove duplicates from array
	static void removeAray(){
		int[]arr={10,10,14,12,13,12,14};
		HashSet<Integer>mySet=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		mySet.add(arr[i])	;
		}
	for(Integer integer : mySet){
		System.out.println("the elemente were"+integer);
	}
	}
	public static void main(String[] args) {	
	//SetExample.createSet();	
	SetExample.removeAray();
	}	
	}
	


