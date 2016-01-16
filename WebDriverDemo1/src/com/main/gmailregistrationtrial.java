package com.main;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeClass;

	public class gmailregistrationtrial {
		WebDriver driver;
	
		public gmailregistrationtrial(WebDriver driver){
			this.driver=driver;	
		}
		public String getmenuitems() {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/intl/en/mail/help/about.html");
			WebElement element=driver.findElement(By.id("gmail-create-account"));
			element.click();
			WebElement firstname=driver.findElement(By.name("FirstName"));
			firstname.sendKeys("mrinal");
			WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
			lastname.sendKeys("shah");
			WebElement element3=driver.findElement(By.cssSelector("input[id='GmailAddress']"));
			element3.sendKeys("mns1234");
			WebElement element4=driver.findElement(By.xpath("//input[@id='submitbutton']"));
			element4.click();
			WebElement errormessage=driver.findElement(By.cssSelector("span[id='errormsg_0_Passwd']"));
			String actually=errormessage.getText();
			driver.quit();
			return actually;			
		}
}


