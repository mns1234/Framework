package com.abstractexample;
/*c. Write a program that creates a class Circle extending Shape abstract class and 
 * implementing ShapeConstants interface and has following behavior.
		--> Properties: radius.
		--> Constructor: To set number of sides.
		--> Overrides all the methods from parents.*/

public class Circle extends Shape{


	void draw() {
System.out.println("the circle");		
	}
	void draw(int radius){
		System.out.println("perfectly drawn circle!");
	}
	
	void print(int length, int breadth) {
		
	}
	
	void calculareAreaCircle(int radius, double pi) {
		double CAC=pi*(radius^2);
		System.out.println("pi is used here to get area "+CAC);
	}



}
