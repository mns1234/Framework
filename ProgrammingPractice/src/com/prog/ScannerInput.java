package com.prog;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ne = new Scanner(System.in);
		System.out.println("Please enter the 2 integers: ");
		int x = ne.nextInt();
		int y = ne.nextInt();
		int z = x+y;
		System.out.println("The sum of the 2 integers is "+z);

	}

}
