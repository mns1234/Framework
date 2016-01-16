package com.test;

import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.GmailHomepage;
import com.main.gmailregistrationtrial;

public class gmailregistrationtrialtest{
	WebDriver driver;
	gmailregistrationtrial gmail;
	GmailHomepage page;
	@BeforeClass
	public void init(){
		driver=new FirefoxDriver();
		gmail=new gmailregistrationtrial(driver);
		page=new GmailHomepage(driver);
	}
	@Test
	public void testValidateRegistration(){
		String actual=gmail.getmenuitems()	;
		String expected="You can't leave this empty.";
		assertEquals(expected,actual);		
	}
	@Test
	public void testgetlinks(){
		
		int actual=page.getLinks();
		int expected=5;
		assertEquals(expected, actual);
	}
	@AfterClass
	public void exit(){
	gmail=null;
	if(driver !=null)
	{
	driver.close();	
	}
	
	}
		
	
	}


