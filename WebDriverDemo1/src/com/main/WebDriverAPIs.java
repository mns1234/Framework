package com.main;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class WebDriverAPIs {
public static void main(String[] args) {	
WebDriver driver=new FirefoxDriver();
driver.get("https://twitter.com/");
System.out.println("the current URL is "+driver.getCurrentUrl());
System.out.println("title is "+driver.getTitle());
//System.out.println("get this "+driver.getPageSource())
List<WebElement> elements= driver.findElements(By.xpath("(//ul[@id='mainMenu']/li/a)"));
for(WebElement element: elements){
	System.out.println("the location is "+element.getText());
	driver.close();
}
}

}
