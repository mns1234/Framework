package com.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailHomepage {
	WebDriver driver;
	
public GmailHomepage(WebDriver driver) 
	{
		this.driver=driver;	
	}
public int getLinks(){
	int count=0;
	driver.get("https://www.google.com/intl/en/mail/help/about.html");
List<WebElement> elements=driver.findElements(By.xpath("(//ul[@id='nav']/li)"));
if(elements !=null && elements.size()>0)
{
	count=elements.size();
}
	
	return count;
	
}
}
