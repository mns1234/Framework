package com.mainshilpi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BBsignUpPage {
	WebDriver driver;
	 public BBsignUpPage(WebDriver driver){
		this.driver=driver;	
		}
	 public String signin(){
		 String msg=null;
		 driver.manage().window().maximize();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		 WebElement uname = driver.findElement(By.xpath("//form/input[@id='fld-e']"));
		 uname.sendKeys("amal@ip.com");
		 WebElement pswd = driver.findElement(By.xpath("//div/input[@id='fld-p1']"));
		 pswd.sendKeys("amal");
		 WebElement submit=driver.findElement(By.xpath("//span[@class='btn-text']"));
		submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Oops! The e-mail or password did not match our records. Please try again.
		WebElement errmsg=driver.findElement(By.xpath("//div[@class='alert-header__text js-alert-header']"));
		 msg= errmsg.getText();
		return msg;
	 }
}
