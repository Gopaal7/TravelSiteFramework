package pageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		 
	}
	
	

	public void setFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		
		lastName.sendKeys(lname);
		
	}
	
	
	public void registerValues(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	
	
	
	
	
}
