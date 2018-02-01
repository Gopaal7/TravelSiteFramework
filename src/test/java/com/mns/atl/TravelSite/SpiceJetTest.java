package com.mns.atl.TravelSite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mns.travelsite.base.TestBase;

import pageLibrary.Spicejet;

public class SpiceJetTest extends TestBase {
	
	Spicejet jet;
	public SpiceJetTest()
	{
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		initialization();
		driver.get(prop.getProperty("loginUrl"));
		
		jet = new Spicejet();
	}
	
	@Test
	public void flightNoTest()
	{
		 
 		jet.setUserName("AA1123");
	}
	
	
}
