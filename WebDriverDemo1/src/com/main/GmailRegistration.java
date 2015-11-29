package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailRegistration {
	
public String validateform() {
	String errorMessage=null;
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");
	WebElement firstName=driver.findElement(By.id("FirstName"));
	firstName.sendKeys("Mrinal");
	WebElement lastName=driver.findElement(By.name("LastName"));
	lastName.sendKeys("Shah");
	WebElement username=driver.findElement(By.xpath(".//*[@id='GmailAddress']"));
	username.sendKeys("mn");
	driver.findElement(By.id("submitbutton")).click();
	WebElement error=driver.findElement(By.className("errormsg"));
	errorMessage=error.getText();
	driver.quit();
	return errorMessage;
	
	
	
}

public String validateForm() {
	// TODO Auto-generated method stub
	return null;
}
}
