package com.prog;

public class ReverseWord {
	public static  void main(String[] args) {
	    String s = "Hello Every One";
	    StringBuffer buffer = new StringBuffer();
	   	    
	    String[] str =s.split(" "); 
	    for(int i=str.length-1;i>=0;i--)
	    {
	        buffer.append(str[i]); // str[2] = one ; one  every ; Hello ; -1>=0 flase 
	        buffer.append(" "); // buffer = one "" ; one "" every "" ; one "" every "" Hello ;
	    }
	    System.out.println("\n Original string: " + s);
	    System.out.println("\n Reverse word string:"+buffer.toString()); // \n - New line  tostring() is used to convert the value to string datatype value .
	    }

}
