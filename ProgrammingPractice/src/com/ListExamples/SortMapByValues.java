package com.ListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValues {
	public static void main(String[] args){
	HashMap<Integer,String> hm= new HashMap<>();
	hm.put(1, "abc");
	hm.put(2, "bcd");
	hm.put(3, "dce");
	hm.put(4, "cef");
	hm.put(5, "fgh");
	hm.put(6, "ghi");	
	
	Set<Entry<Integer, String>> set = hm.entrySet();
    List<Entry<Integer, String>>list = new ArrayList<Entry<Integer, String>>(set);
    Collections.sort(list, new Comparator<Map.Entry<Integer, String>>()
    {
        public int compare( Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2 )
        {
            return (o1.getValue()).compareTo( o2.getValue() );
        }
    } );
    for(Entry<Integer, String> entry:list){
        System.out.println(" the sorted  "+entry.getValue());
    }

}}