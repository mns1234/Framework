package com.test;


public class TestArray {
	public int getLaregestNumber(int[]arr){	
	
	int num=arr[0];
	for(int i=0;i<arr.length;i++){
		if(num<arr[i]){
			num=arr[i];
		}
	}
	return num;
	}

}
