package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Practice.MainBank;

public class MapExample {
static void createMap(){
	HashMap<Integer,String>myMap= new HashMap<>();
	myMap.put(01,"keya" );
	myMap.put(02,"keyas" );
	myMap.put(03,"keyass" );
	myMap.put(04,"keyasss" );
	for(Map.Entry map:myMap.entrySet())
	{
		System.out.println(map.getKey()+ " " +map.getValue());
	}
	Set<Integer> set=myMap.keySet();
	
	for(Integer integer:set){
		System.out.println(integer);
	}
	Collection<String> values=myMap.values();
	for(String string:values){
		System.out.println(string);
	}
	//myMap.keySet for getting keys,.values for getting the values
	//System.out.println(myMap.values());
	}
	public static void main(String[] args){
		MapExample.createMap();
}
}
