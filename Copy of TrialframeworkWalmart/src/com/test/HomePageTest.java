package com.test;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.HomePage;
import com.util.PageDriver;

public class HomePageTest extends BaseTest {

	HomePage hp;
	@BeforeClass
	public void initialize()
		{
		hp=new HomePage(driver);
		}
	@DataProvider(name="signindata")
	public Object [][] getdata()
		{
		return new Object [][]{{"aa","aa"},{"bb","bb"},{"cc","cc"}};		
		}
	@Test(dataProvider="signindata")
	public void signintest (String uname,String pwd)
		{
		boolean actual=hp.signin(uname, pwd);
		 Assert.assertTrue(actual);			
		}
	@Test(enabled=false)
	public void topmenutest()
		{
		int actual=hp.topmenu();
		Assert.assertEquals(actual, 8);
		}
	@Test(enabled=false)
	public void imagetest() throws Exception
		{
		int num;		
		num = hp.image();
		Assert.assertEquals(num,7);
		}
	@Test(enabled=false)
	public void inalidccounttest()
		{
		String actual=hp.invalidaccount();
		Assert.assertEquals(actual, "Sign in to your account");
		}
	@Test(enabled=false)
	public void searchboxtest()
		{
		String s=hp.searchbox();
		Assert.assertEquals(s, "Toys");
		}

	@Test(enabled=false)
	public void alldepartmentstest()
		{
		 hp.alldepartments();		 
		}
		
	@AfterClass
	public void quit()
		{
		driver.quit();
		}
	
}
