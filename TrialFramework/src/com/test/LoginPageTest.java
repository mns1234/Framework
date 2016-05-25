package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.PageDriver;

public class LoginPageTest extends BaseTest {

	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void initialize()
	{
		lp=new LoginPage(driver);

		hp.clickLogin();
		hp=new HomePage(driver);
	}
	@Test
	public void login()
	{
		String actual=lp.invalidLogin("ww","ww");
		String expected="You have not registered.";
		Assert.assertEquals(actual, expected);
	}
}
