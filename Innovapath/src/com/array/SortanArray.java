package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class SortanArray {
	static ArrayList<Integer> sortLiist(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);			
			}
			}
		}//(This will be synchronised, similar & better than vector)
		Collections.synchronizedCollection(list);
		//Collections.sort(list);
		return list;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
		list.add(8);
		list.add(38);
		list.add(9);
		list.add(6);
		for(Integer i:list)
		{
			System.out.println("Before  "+i);
		}
		list=sortLiist(list);
		for(Integer i:list)
		{
			System.out.println("After   "+i);
		}
	}

}
