package com.testshilpi;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mainshilpi.bestbuyHomepage;

public class bestbuyHomepageTest {
	WebDriver driver;
	@BeforeMethod
	public void init(){
	driver=new FirefoxDriver();
		driver.get("http://www.bestbuy.com/");
		//driver.get("http://www.bestbuy.com/site/store-locator");
	}
	@Test
public void testserach(){
	bestbuyHomepage hp=new bestbuyHomepage(driver);
	hp.typeinSearchBox();
	
}
	@Test
	public void gerProductListItems(){
		bestbuyHomepage bp=new bestbuyHomepage(driver);
		List<String>actual=bp.gerProductListItems();
		System.out.println(actual);
		
	}	
	@AfterMethod
	public void close(){
		if(driver!=null){
			driver.close();
		}
	}
	

}

