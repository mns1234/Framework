package com.abstractexample;
/*a. Write a program creating an abstract class Shape with properties 
 * (noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.
 */
public abstract class Shape3 {
	int length;
	int breadth;
public Shape3(int length,int breadth){
	this.length=length;
	this.breadth=breadth;
	
}
	abstract void calculateArea();
	abstract void calculatePerimeter();
	abstract void setSides();
	
	
}
