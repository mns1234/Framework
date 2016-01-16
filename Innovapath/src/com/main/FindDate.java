package com.main;

import java.text.SimpleDateFormat;

import java.util.Date;

public class FindDate {
static void realDate(){
	SimpleDateFormat format=  new SimpleDateFormat("dd/mm/yy");
	
	Date d=new Date();
	System.out.println(format.format(d));
	
	
	
}
	public static void main(String[] args) {		
FindDate.realDate();
	}

}
