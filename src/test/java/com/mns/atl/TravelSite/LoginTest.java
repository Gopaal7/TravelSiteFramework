package com.mns.atl.TravelSite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mns.atl.pages.LoginPage;
import com.mns.travelsite.base.TestBase;



public class LoginTest extends TestBase {
	
	LoginPage login;
	
	public LoginTest()
	{
		super();
	}
	
	 
	@BeforeMethod
	public void setUp()
	{
		initialization();
		driver.get(prop.getProperty("loginUrl"));
		login = new LoginPage();
		
	}
	
	@Test
	public void loginPageTest()
	{
		login.loginTravel(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
	

}
