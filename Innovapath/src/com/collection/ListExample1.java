package com.collection;


import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class ListExample1{
	
		
	static void accessElements(LinkedList array){
		/*for(Object obj:array){
			System.out.println("The elements in the array are "+ obj);}
		}	*/
		Iterator itr=array.iterator();
		while(itr.hasNext()){
			System.out.println("the new sentence is "+ itr.next());}
		}	
		static void addToList(){
	LinkedList array =new LinkedList();
	array.add("sshshs");
	
	Stack<String> stack=new Stack<>();
	stack.push("Keya");
	stack.push("Nilesh");
	stack.pop();	

accessElements(array);}
	
	public static void main(String[] args) {
		ListExample1.addToList();
	}
}
