package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.main.GmailRegistration;

public class GmailRegistrationTest {
	
	@Test
	public void testValidateform(){
	GmailRegistration gr = new 	GmailRegistration();
	String actual=gr.validateform();
	String expected="You can't leave this empty.";
	assertEquals(expected,actual);
	}

	
	}


