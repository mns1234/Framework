package com.main;

public class Boys extends Children {
public int getAge(){
	return 5;}
	public void getplay(){
		System.out.println("The boys are playing ");

	}
	
	static void play1(Children k){
		Boys k1=(Boys)k;
		k1.getplay();
}
	public static void main(String[] args) {
		Children v=new Children();
		v.addno();
		Children g=new Children();
		g.addno3();
		
		
		Children c=new Boys();
		Boys.play1(c);
	}
}

