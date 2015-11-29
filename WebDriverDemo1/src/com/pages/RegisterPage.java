package com.pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


	public class RegisterPage {
		WebDriver driver;
		
		public RegisterPage(WebDriver driver)
		{
			this.driver=driver;
		}
	public WebElement ValidateRegistration(){
		
		driver.get("https://www.gmail.com/intl/en/mail/help/about.html");
		WebElement createAcctBtn=driver.findElement(By.id("gmail-create-account"));
		createAcctBtn.click();
		WebElement fname=driver.findElement(By.name("FirstName" ));
		fname.sendKeys("Mrinal");
		WebElement lname=driver.findElement(By.name("LastName" ));
		lname.sendKeys("Shah");
		WebElement username=driver.findElement(By.xpath("//input[@id='GmailAddress']"));
		username.sendKeys("ms.mrinalsha@gmail.com");
		WebElement password=driver.findElement(By.cssSelector("input[name='Passwd']"));
		password.sendKeys("1234");
		WebElement cnfpwd=driver.findElement(By.cssSelector("input[name='PasswdAgain']"));
		cnfpwd.sendKeys("1234");
		WebElement nextBtn=driver.findElement(By.id("submitbutton"));
	    nextBtn.click();
	    WebElement errormessage=driver.findElement(By.id("errormsg_0_BirthYear" ));    
		
	    return errormessage;

		
	}
	}



