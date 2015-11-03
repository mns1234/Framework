package com.main;

public class ConsructureExample {

	int id;
int length;
int breadth;
	
ConsructureExample(int a,int b){
	 id=a;
	length=b;
}
ConsructureExample(int a, int b, int c){
	 id=a;
	 length=b;
	 breadth=c;
}
void show(){
	System.out.println("the id is: "+id+ "\nlength is:"+length+"\nbreadth is:"+breadth);
}

public static void main (String [] args){
	ConsructureExample ex=new ConsructureExample(10,20,30);
	ConsructureExample ex1=new ConsructureExample(50,25);
	ex.show();
	ex1.show();
ex.id=ex1.id;
ex.length=ex1.length;
}
}

