package com.ListExamples;
import java.util.Collection;
//--> To create a hashmap.
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(1, "abc");
		hm.put(2, "bcd");
		hm.put(3, "dce");
		hm.put(4, "cef");
		hm.put(5, "fgh");
		hm.put(6, "ghi");
		for
		(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		Set<Integer> s=hm.keySet();
		for(Integer i:s)
		System.out.println(i);//to get a set of keys
		Collection<String> list= hm.values();
		for(String s1: list)
		{
			System.out.println(s1);
		}
		System.out.println("the value for this key(3) is "+hm.get(3));
	}	

}
