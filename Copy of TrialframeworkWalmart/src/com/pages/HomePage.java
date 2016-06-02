package com.pages;

import java.io.File;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage{

	public HomePage(PageDriver driver)
		{
		super(driver);

		}

	public void logo()
		{
			driver.findElement(By.xpath(Locators.loca.get("walmart-logo"))).isDisplayed();
			driver.takeScreenShot();
		}
	public int image() throws Exception
		{	int i=0;
			List<WebElement> ele=driver.findElements(By.xpath(Locators.loca.get("image")));
			
	//		try {
	//			Thread.sleep(5000);
	//		} catch (InterruptedException e) {
	//			e.printStackTrace();
	//		}
			driver.implicitWait(8000);			
			for(WebElement element:ele)
			{ 
				i=ele.size();			
			}
		return i;
		}
	public int topmenu() 
		{
			int count=0;
			driver.maximize();
			List<WebElement> elements=driver.findElements(By.xpath(Locators.loca.get("top-menu-items")));
			if(!elements.isEmpty())
			{
			count=elements.size();
			}
			return count;
		}
	public boolean signin (String uname,String pwd)
		{		Boolean isVisible=null;
			driver.findElement(By.cssSelector(Locators.loca.get("sign-in"))).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			WebElement username=driver.findElement(By.cssSelector(Locators.loca.get("username")));
			username.sendKeys(uname);
			WebElement password=driver.findElement(By.cssSelector(Locators.loca.get("password")));
			password.sendKeys(pwd);
			try {
				driver.implicitWait(5000);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			WebElement elem=driver.findElement(By.cssSelector(Locators.loca.get("error-message")));
			isVisible=elem.isDisplayed();
			return isVisible;			
		}
	public String searchbox()
		{   String toys=null;
			driver.findElement(By.cssSelector(Locators.loca.get("search-box"))).sendKeys("toys");
			driver.findElement(By.cssSelector(Locators.loca.get("click-search-button"))).submit();
				try 
				{
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			WebElement element=driver.findElement(By.xpath(Locators.loca.get("toys-result")));
			toys=element.getText();
			return toys;
		}
	
	
	public String invalidaccount() 
		{
			String  signin=null;
			driver.findElement(By.cssSelector(Locators.loca.get("create-account"))).click();
				try 
				{
					Thread.sleep(5000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			WebElement element=driver.findElement(By.cssSelector(Locators.loca.get("signintitle")));
			signin=element.getText();
			 driver.takeScreenShot();
	        return signin;
			}
	public String  alldepartments()
		{	String few=null;
			driver.findElement(By.id(Locators.loca.get("all-departments"))).click();
			List<WebElement> elements= driver.findElements(By.xpath("(//ul[@id='mainMenu']/li/a)"));
			try {
				Thread.sleep(10);
				} 
			catch (InterruptedException e1) 
			{
				e1.printStackTrace();
			}
			for(WebElement element: elements){
				 few=element.getText();
			try {
					Thread.sleep(9000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
			}
			return few;
	}
	
	
}
