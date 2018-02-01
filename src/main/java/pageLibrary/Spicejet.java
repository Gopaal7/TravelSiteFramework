package pageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mns.travelsite.base.TestBase;

public class Spicejet  {
	WebDriver driver;
/*	@FindBy(id="FlifoSearchInputCompactFlightStatus$TextBoxFlightNumber")
	WebElement FlightNo;
*/	
	@FindBy(name="username")
	WebElement username;
	
	public void SpiceJet(WebDriver driver)
	{
		 
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String uName)
	{
			username.sendKeys(uName);
	}
	
	
/*	public void setFlightNo(String fligthNo)
	{
		FlightNo.sendKeys(fligthNo);
	}
*/
}
