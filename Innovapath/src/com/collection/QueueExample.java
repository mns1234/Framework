package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
	static void CreateQueue(){
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("Keya");
		queue.add("heni");
		queue.add("bhavin");
		queue.add("bhavya");
		System.out.println(queue.peek());//shows first element
		System.out.println(queue.poll());//removes first element & shows it
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());//show list of names
		}
	}
	public static void main(String[] args) {
		QueueExample.CreateQueue();
		
	}
}
