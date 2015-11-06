package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;

public class ListExample {
	
	
	static void accessElements(ArrayList list){
		/*{
			System.out.println("the first object is "+ list.get(1));
			
		}*/
	for(Object obj:list){
			System.out.println("The elements in the array are "+ obj);
		}	
		
	/*	Iterator itr=array.iterator();
		while(itr.hasNext()){
			System.out.println("the names are "+itr.next());
		}*/
	}	

	static void addToList(){
		ArrayList<String> list=new ArrayList();
		list.add("Bharti");
		list.add("Sinha");
		list.add("1000");
		list.add("Lal");		
		
		accessElements(list);
		sortList(list);
	}
	
	static void sortList (ArrayList<String>myList)
	{
		Collections.sort(myList);
		accessElements(myList);
	}
	public static void main(String[] args) {
		ListExample.addToList();
		//ArrayList array;

		
	}
}
