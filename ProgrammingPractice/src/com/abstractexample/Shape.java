package com.abstractexample;
//it will have just a signature of a function

public abstract class Shape {
	int length;
	int breadth;
	double pi=3.14;
	public Shape(){
		System.out.println("constructor");
	}

	
	abstract void draw();	
	abstract void draw(int radius);
	abstract void print(int length, int breadth);
	abstract void calculareAreaCircle(int radius, double pi);
	void print(){
		System.out.println("printing");
	}

	
	
}
