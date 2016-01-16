package com.testshilpi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mainshilpi.BBsignUpPage;
import com.mainshilpi.bestbuyHomepage;

import org.testng.asserts.*;

public class BBsignuptest {
	WebDriver driver;

	@BeforeMethod
	public void init(){
	driver=new FirefoxDriver();
	driver.get("http://www.bestbuy.com/");
}
	@Test
	public void testsignup(){
		bestbuyHomepage bp=new bestbuyHomepage(driver);
		BBsignUpPage sp = bp.signup();
		String actual=sp.signin();
		String expected="Oops! The e-mail or password did not match our records. Please try again.";
		Assert.assertEquals(expected, actual);
		//Assert.assertTrue(actual.equalsIgnoreCase("Oops! The e-mail or password did not match our records. Please try again."));
	}
	@AfterMethod
	public void end(){
		if(driver!=null){
			driver.close();
		}
	}
}