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
	public static void main(String[] args) {	
	SetExample.createSet();		
	}
	public static void removearray() {
		// TODO Auto-generated method stub
		
	}
	
	}
	


