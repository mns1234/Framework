package com.prog;
/*c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
+     		   --> One Function should swap the numbers without any third new variable.
+      		 --> Second function should swap the numbers using a third variable.
*/
public class Numberswap {	
	public void swap(int i , int j){
		int k;
		k=j;
		j=i;
		i=k;
		System.out.println(i + " and a "+ j);}
		
		public void swap4(int i ,int j){
			j=j+i;
			i=j-i;
			j=j-i;
			
			System.out.println(i+" and an "+j);
		}
		public static void main(String[] args) {
			Numberswap ns = new Numberswap();
			ns.swap(10, 20);
			ns.swap4(10, 20);}	

	}


