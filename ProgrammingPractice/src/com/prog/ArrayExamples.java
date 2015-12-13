package com.prog;

public class ArrayExamples {
	public static void main(String[] args) {
		int[]arr1={10, 20,44,1,5};
		swapArray(arr1);
	/*	for(int i:arr1){
			System.out.println(i);
		}*/
		
		/*ArrayExamples a1 = new ArrayExamples();
		int[]arr1={10,40,20,30,60,12};
		a1.largestno(arr1);
		int[]arr={10,20,30,40,50};{
			for
			(int i=0;i<arr.length;i++)
			{
			System.out.println("the array elements are "+arr[i]);	
			}
		}*/
	}
/*public static void largestno(int[]arr){
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if (max<arr[i])
		{
			max=arr[i];}
	
	else{System.out.println("the largest no. is:"+max);*/
	
	public static void swapArray(int[]arr1){
		
	for(int i=0,j=arr1.length-1;i<arr1.length/2;i++,j--){
		int temp=arr1[i];
		arr1[i]=arr1[j];
		arr1[j]=temp;
		
	}
	for(int i=0;i<arr1.length;i++){
	System.out.println("the swapped array is "+arr1[i]);}
	
		}
	}
		
	



