package com.test;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.main1.LargestNoArray;

public class LargestNoArrayTeat {
	LargestNoArray la;
	 static long startTime;
	 static long endTime;
	
	@BeforeClass
	public static void startclass(){
		System.out.println("Before class");
		startTime=System.currentTimeMillis();	
	}
	@Before
	public void initial(){
		System.out.println("inbetween class");
	la=new LargestNoArray();
	}	
	@Test
	public void largenofind(){
		int[]arr={1,3,7,4,8,2};
		int large=la.getLaregestNumber(arr);
		assertEquals(8,large);		
	}
	@Test(timeout=12)
	public void negativeno(){
		int[]arr={-1,-3,-7,-4,-8,-2};
		int large=la.getLaregestNumber(arr);
		assertEquals(-1,large);}
	@Test@Ignore
	public void mixno(){
		int[]arr={-1,3,-7,4,-8,2};
		int large=la.getLaregestNumber(arr);
		assertEquals(4,large);}
	@Test//(expected=NullPointerException.class)or (expected=exception.class) 
	public void nullno(){
		int[]arr={};
		int large=la.getLaregestNumber(arr);
		assertEquals(0,large);}                //assertTrue, assertFalse, assertSame,assertNull,assertNotNull,asssertArrayEquals
	@Test
	public void Inte(){
		int[]arr={Integer.MAX_VALUE,Integer.MIN_VALUE,0};
		int large=la.getLaregestNumber(arr);
		assertEquals(Integer.MAX_VALUE,large);}
	@After
	public void endmethod(){
	System.out.println("after method");	
	}
	@AfterClass
	public static void endclass(){
		System.out.println("After class");
		endTime=System.currentTimeMillis();
		long duration=startTime-endTime;
		System.out.println(duration);
	}
	}



	

	

