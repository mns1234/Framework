package com.main;

public class ConsructureExample {
	int id;
int length;
int breadth;

ConsructureExample(int a,int b)
{
	int id=a;
	int length=b;
}
ConsructureExample(int a, int b, int c){
	int id=a;
	int length=b;
	int breadth=c;
}
void show()
{System.out.println("the id is: "+ "length is:"+length);
System.out.println("the id is: "+ "length is:"+length+"breadth is:"+breadth);
}

public static void main (String [] args){
	ConsructureExample ex=new ConsructureExample(10,20,30);
	ConsructureExample ex1=new ConsructureExample(10,20);
ex.id=ex1.id;
ex.length=ex1.length;
}

}

