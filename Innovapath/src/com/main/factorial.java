package com.main;

public class factorial {

		public int calculateFact (int num)
		{
			int fact=num;
			for(int i=num-1; i>1;i--)
			{
				fact=fact*i;
			}
			return fact;
		}
			
			public static void main(String[] args) {
				factorial fact=new factorial();
				int val=fact.calculateFact(6);
				System.out.println("the factorial is"+val);
				
			}
		
			
		}
		
		
		
		
	


