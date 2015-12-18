package com.main1;


public class LargestNoArray {
	int num=0;

	public int getLaregestNumber(int[]arr){	
try{
	num=arr[0];
	for(int i=0;i<arr.length;i++){
		if(num<arr[i]){
			num=arr[i];
			}
		}
	}
	catch(NullPointerException e){
	e.printStackTrace();
	}
	catch(Exception e)
	{ 
	e.printStackTrace();
	}
return num;
}

}
