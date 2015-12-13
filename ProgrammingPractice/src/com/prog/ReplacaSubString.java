package com.prog;
import java.util.Scanner;
//. Write a program to find a substring in a given string and then replace it 
//with another string.
public class ReplacaSubString {
	public static void main(String[] args) {
		String initial;
		String initialword="talk";
		String replaceword="chat";
		
		int startindexvalue=0;
		int endindexvalue=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your string: ");
		 initial = sc.nextLine();
		 System.out.println("initial string: "+initial);
		 startindexvalue=initial.indexOf(initialword);
		endindexvalue= startindexvalue+ initialword.length();
		
		if(startindexvalue!=-1){
			initial=initial.substring(0,  startindexvalue) + replaceword +initial.substring(endindexvalue) ;
			System.out.println("replaced string:"+initial);
		}
		else{
			System.out.println("string not found");
		}
	}

}
