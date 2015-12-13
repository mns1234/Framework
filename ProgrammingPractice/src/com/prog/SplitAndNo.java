package com.prog;
import java.util.Scanner;
public class SplitAndNo {
	String str;
	public static void main(String[] args) {
		SplitAndNo s1 = new SplitAndNo();
		s1.run();

	}

	public void run(){
		int n= 0;
		Scanner inputG = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		str = inputG.nextLine();
		String delimiter = " ";
		String[] temp;
		temp = str.split(delimiter);
		for(int i =0; i < temp.length ; i++){
			n+=1;
			System.out.print(temp[i]+""+n+" ");
			}
	}
}
