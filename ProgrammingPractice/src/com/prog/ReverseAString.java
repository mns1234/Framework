package com.prog;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
String initial;
String reverse="";

Scanner sc =new Scanner(System.in);
System.out.println("please enter your string: ");
 initial = sc.nextLine();
 int len=initial.length();

	 for
	 (int i=len-1;i>=0;i--){
		reverse=reverse+initial.charAt(i) ;
	 }

 

 System.out.println("the reverse string is:"+reverse);
	}

}
