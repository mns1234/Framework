package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	
	
	static void accessElements(ArrayList array){
		{
			System.out.println("the first object is "+ array.get(1));
			
		}
	/*for(Object obj:array){
			System.out.println("The elements in the array are "+ obj);
		}	*/
		
	/*	Iterator itr=array.iterator();
		while(itr.hasNext()){
			System.out.println("the names are "+itr.next());
		}*/
	}	

	static void addToList(){
		ArrayList<String> array=new ArrayList();
		array.add("Bharti");
		array.add("Sinha");
		array.add("100");
		array.add("Lal");		
		
		accessElements(array);
	}
	public static void main(String[] args) {
		ListExample.addToList();
		ArrayList array;
		
	}
}
