package com.mns.atl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mns.travelsite.base.TestBase;

public class Home extends TestBase {
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),\'Login\')]")
	WebElement loginButton;
	
	public Home()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginTravel(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		
	}
	 

}
