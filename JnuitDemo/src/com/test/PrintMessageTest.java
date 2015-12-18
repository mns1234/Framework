package com.test;

import org.junit.Test;

import com.main1.PrintMessage;


public class PrintMessageTest {
	@Test
	public void testmessage(){
		String str = ", Keya";
		PrintMessage pm = new PrintMessage();
		String str1 = pm.printers(str);
		System.out.println(str1);
		
	}

}
