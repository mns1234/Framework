package com.prog;
//. Write a program to perform a linear search on any given array.Linear search is the basic
//search where you look for the element to be searched in a sequential way
public class LinearSearchArray {

	public static void main(String[] args) {
int[] array={11,22,33,44,55,66,77,88,99};
int target=55;
for(int i=0;i<array.length;i++)
{
	if(array[i]==target)
	{
		System.out.println("the no. to be searched is: "+array[i]);
	
	}
}
	}

}
