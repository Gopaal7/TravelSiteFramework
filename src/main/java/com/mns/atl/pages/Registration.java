package com.mns.atl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mns.travelsite.base.TestBase;

public class Registration extends TestBase {
	
	//Page Factory or Object Repository
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),\'Sign Up\')]")
	WebElement signUp;
	
	@FindBy(name="confirmpassword")
	WebElement confirmpassword;
	
	
	
    // initializing the page objects
	public Registration()
	{
			PageFactory.initElements(driver, this);
	}
	
	// Actions or methods
	
	public void registrationUser(String fname,String lname, String phone, String email, String password, String confirm)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		this.phone.sendKeys(phone);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.confirmpassword.sendKeys(confirm);
		//signUp.click();
		
	}
	
	
	
}
