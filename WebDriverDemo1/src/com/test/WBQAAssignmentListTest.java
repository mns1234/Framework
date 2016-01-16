package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.WBQAAssignmentList;

public class WBQAAssignmentListTest {
	WebDriver driver;
	@BeforeMethod
	public void init(){
	driver=new FirefoxDriver();
	}
	
	@Test
	public void testgetlisttest(){
		WBQAAssignmentList wb=new WBQAAssignmentList(driver);
		List<String>actual=wb.getList();
		System.out.println(actual);
	
		
	}

	
	
	
	
	@AfterMethod
	public void close(){
		if(driver!=null){
			driver.close();
		}
	}
	

}
