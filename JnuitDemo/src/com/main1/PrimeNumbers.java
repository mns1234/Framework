package com.main1;

public class PrimeNumbers {
	public boolean checkPrime(int number){
		boolean isPrime=true;
		for(int i=2;i<(number/2);i++)
		{
			if(number%i==0)//(no number can divide a no. greater than half of it)
			{
				isPrime=false;
			}
		}
		return isPrime;
	}

}
