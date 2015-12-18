package com.prog;

public class ReverseWord2 {

	public static void main(String[] args) {
		String str = "Keya Nilesh Shah";
		ReverseWord2 r1 = new ReverseWord2();
		String revStr = r1.run(str);
		System.out.print(revStr);
	}
	public String run(String str)
	{
		String temp = "";
		int len=str.length();
		String reverse="";

		for(int i =0; i < len ; i++)
		{
			temp += str.charAt(i);
			if((str.charAt(i) == ' ') || (i == len))
            {
				for(int x=len-1;x>=0;x--)
				{
					reverse=reverse+str.charAt(x) ;
					if((x == 0) && (i != len))
						reverse += " ";
			
				}
				
				temp = "";
            }
		 } 

		return reverse;

	}

}
