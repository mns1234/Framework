package com.prog;

public class FibbonaciNumber {
	int first= 0;
	int second = 1;

	public static void main(String[] args) {
		FibbonaciNumber f1 = new FibbonaciNumber();
		f1.run();

	}
	
	public void run(){
		for(int i = 1; i<=5; i++){
		System.out.print(" "+ first + " " + second);
		first = first+second;
		second = second+first;
		
		}
	}

}
