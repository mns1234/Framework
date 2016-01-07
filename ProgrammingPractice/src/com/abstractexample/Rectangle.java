package com.abstractexample;

public class Rectangle extends Shape3{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}


	void calculateArea() {
		int area=length*breadth;
		System.out.println("the area of rectangle is "+area);
	}

	
	void calculatePerimeter() {
		int perimeter=2*(length+breadth);
		System.out.println("the perimeter of rectangle is "+perimeter);}

	void setSides(){
		System.out.println("the sides are length & breadth");
		
	}
	

	

}
