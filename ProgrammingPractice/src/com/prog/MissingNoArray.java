package com.prog;

public class MissingNoArray {

	public static void main(String[] args) {
		int[]a={1,2,3,5,6,7,8,9};
		int len=a.length;
		int sum=0;
		for
		(int i=0;i<a.length;i++)
		{
		sum+=a[i];	
		}
		int total=((len+1)*(len+2))/2;
		int missingNo=total-sum;
		System.out.println("the missing no. is "+missingNo);
	}

}
/*int []finalArray = {1,2,3,4,5,7,8,9,10};
int len = finalArray.length; //First, I took the length of the array.
int sum = 0;
  for(int x=0;x<len;x++)
     sum+=finalArray[x]; //Second, I took the sum of the given array.
int totalNumber = ((len + 1) * (len + 2)) / 2; //Third, I used this formula to get the total number.
int missingInt = totalNumber - sum; // Fourth, I subtract the sum to total number to get missing integer.
System.out.println("\nTherefore, the missing integer is " + missingInt + ".");
}

public static void main(String[] args){
  PrintArray();
  FindMissing();
}*/