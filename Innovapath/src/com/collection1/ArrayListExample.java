package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
ArrayList<String> arr=new ArrayList<>();
arr.add("Keya");
arr.add("Mrinal");
arr.add("110"); 
ArrayList<String> arr1= new ArrayList<>();
arr1.add("babita");
arr1.add("sinha");

arr.addAll(arr1);

//arr.add(Integer.valueOf(1000));
/*for(int i=0;i<arr.size();i++){
	System.out.println(arr.get(i));
}
for(String s:arr){
	System.out.println(s);
	/*if (s.equals("Mrinal")){
	break;
	
	}
}*/
Iterator<String> it=arr.iterator();
while(it.hasNext()){
	String s=it.next();
	System.out.println(s);
}
	}

	

}
