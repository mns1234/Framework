package com.abstractexample;
//main is exposed to user
public class main {
	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
		s.print();
		s.draw(5);
		
		Shape s1=new square(4,3);
	s1.print(4, 3);
	}
}
