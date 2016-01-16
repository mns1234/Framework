package com.WBQA.assignments;
//Question:Write me a class with main method which will have two double value types,
//copy one from another, change values later, and print the values initial, 
//after assignments and at last.
public class DoubleValues {
public double a;
public double b;
public double temp;

public void exchangeNos(double a, double b){
	System.out.println("a & b before change: "+a+ " "+b);
	temp=b;
	b=a;
	a=temp;
	System.out.println("a & b after change: "+a+ " "+b);
}
	public static void main(String[] args) {
DoubleValues d=new DoubleValues();
d.exchangeNos(2.2,5.5);
	}

}
