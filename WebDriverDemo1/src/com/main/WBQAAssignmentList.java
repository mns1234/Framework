package com.main;
//nov 4 2014
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WBQAAssignmentList {
	static WebDriver driver;
public  WBQAAssignmentList(WebDriver driver){
this.driver=driver;
}
public List<String> getList(){
	driver=new FirefoxDriver();

	driver.navigate().to("http://whiteboxqa.com/assignments.php");
	WebElement uname=driver.findElement(By.id("username"));
	uname.sendKeys("ms.mrinalshah@gmail.com");
	WebElement pswd=driver.findElement(By.id("password"));
	pswd.sendKeys("Sunflower1");
	WebElement login=driver.findElement(By.id("login"));
	login.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	WebElement button=driver.findElement(By.xpath("//*[@id='assignment']/div[1]/div[2]/b"));
	button.click();	
	List<String>allitemsText=new ArrayList<>();
	List<WebElement>allitems=driver.findElements(By.xpath("*[@id='assignment']/div[1]/div[3]/div/ul/li"));
	Iterator<WebElement> it=allitems.iterator();
	while(it.hasNext()){
	WebElement question=it.next();
	String st=question.getText();
	allitemsText.add(st);
		
}
	return allitemsText;

}}
