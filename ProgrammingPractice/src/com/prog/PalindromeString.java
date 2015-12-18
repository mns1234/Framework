package com.prog;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String initial ="";
		String reverse="";

		Scanner sc =new Scanner(System.in);
		System.out.println("please enter your string: ");
		 initial = sc.nextLine();
		 int len =initial.length();

			 for
			 (int i=len-1;i>=0;i--){
				reverse=reverse+initial.charAt(i) ;
			 }
			 System.out.println(""+reverse);

		if(initial.equals(reverse)){
			System.out.println("The string is a palindrome.");}
		else{
			System.out.println("The string isn't a palindrome.");}

	}

}
