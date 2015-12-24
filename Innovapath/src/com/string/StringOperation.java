package com.string;

public class StringOperation {

	public static void main(String[] args) {
String str="FUNNY";
String str1="FUN";
String str2=new String("FUN");
if(str==str1)
{
	System.out.println("good");
}
else if (str1==str2)
	{System.out.println("not good");
	}
System.out.println(str.charAt(2));
System.out.println(str.length());
System.out.println(str.compareTo("FUNDA"));
System.out.println(str.indexOf("N"));
System.out.println(str.concat(" Story"));
System.out.println(str.isEmpty());
System.out.println(str.lastIndexOf("N"));
System.out.println(str.getBytes());
System.out.println(str.toLowerCase());
System.out.println(str.substring(1,3));


}}
