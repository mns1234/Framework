package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.xerces.dom.PSVIDOMImplementationImpl;

public class Student {
	int id;
	String name;
public  Student(int id,String name) {
	this.id=id;
	this.name=name;
}
public static void main(String[] args) {
	Student s4 = new Student(100, "Bharti");
	Student s1=new Student(101,"Keya");
	Student s2=new Student(102,"Keyaa");
	Student s3=new Student(101,"Key");
	ArrayList<Student> alist=new ArrayList<>();
	alist.add(s4);
	alist.add(s1);
	alist.add(s2);
	alist.add(s3);
	
	/*for
	(Student sd:alist){
	System.out.println("id: "+sd.id+" name: "+sd.name);}*/
	Iterator<Student> it=alist.iterator();
	while(it.hasNext()){
		Student s=it.next();
		System.out.println("id: "+s.id+" name: "+s.name);
	}
	
}

}
