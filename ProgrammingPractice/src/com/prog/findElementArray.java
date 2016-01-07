package com.prog;
 // c. Write a program to find the common number in any given two arrays.
public class findElementArray {

	public static void main(String[] args) {
		int[]arr1={1,2,3,5,7,8};
		int[]arr2={4,6,7,9,10};
		for
		(int i=0;i<arr1.length;i++)
		{
			for
			(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
				{
					System.out.println("this is common no."+arr1[i]);
				}
				
			}
		}
	}

}
