package com.mainshilpi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class bestbuyHomepage {
WebDriver driver;

public bestbuyHomepage(WebDriver driver){
	this.driver=driver;	
	}
public void typeinSearchBox(){
	WebElement ziptxtBox=driver.findElement(By.name("st"));
	ziptxtBox.sendKeys("cell phone");
	WebElement button=driver.findElement(By.xpath("//button[@title='Search']"));
	button.click();
	
	}
public List<String> gerProductListItems(){
	List<String>allitemsText=new ArrayList<>();
	List<WebElement>allitems=driver.findElements(By.xpath("//div[@id='group0']/ul/li"));
	Iterator<WebElement>it=allitems.iterator();
	while(it.hasNext()){
		WebElement item=it.next();
		String text=item.getText();
		allitemsText.add(text);
	}	
	return allitemsText;	
}
public BBsignUpPage signup(){
	WebElement signup = driver.findElement(By.linkText("Sign In"));
	signup.sendKeys(Keys.ENTER);
	return new BBsignUpPage(driver);
	
}}