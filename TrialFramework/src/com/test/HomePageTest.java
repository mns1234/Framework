package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.HomePage;
import com.util.PageDriver;

public class HomePageTest extends BaseTest {

	HomePage hp;
	@BeforeClass
	public void initialize(){
		hp=new HomePage(driver);
	}
	@Test
	public void testCountSocialIcons(){
		int actual=hp.countSocialIcons();
		Assert.assertEquals(actual,4);
		
	}
	@Test
	public void clickLogin()
	{
		String actual= hp.clickLogin();
		Assert.assertEquals(actual,"http://whiteboxqa.com/login.php" );
	}
}
