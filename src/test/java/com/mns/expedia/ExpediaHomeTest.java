package com.mns.expedia;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mns.atl.pages.ExpediaHome;
import com.mns.atl.pages.Registration;
import com.mns.travelsite.base.TestBase;

public class ExpediaHomeTest extends TestBase {
	
	
	ExpediaHome expHome;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		driver.get(prop.getProperty("expedia"));
		expHome = new ExpediaHome();
	 
		  
	}
	
  @Test
  public void ticketSubmit() throws InterruptedException {
	  
	  String orgin = "atl";
	  String dest = "PDX";
	  
	  
	  expHome.selectOrgin(orgin);
	  
	  expHome.selectDest(orgin);
	  
	  expHome.departingDate();
	  
	  expHome.returningDate();
  }
}
