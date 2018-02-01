package com.mns.travelsite.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public	static WebDriver driver;
public	static Properties prop;
	
	
	public TestBase()
	{
		
		prop = new Properties();
		try {
			FileInputStream stream = new FileInputStream("C:\\SeleniumProjects\\TravelSite\\src\\main\\java\\com\\mns\\travelsite\\config\\Config.properties");
			prop.load(stream);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void initialization()
	{
		
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\MIsc\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		//driver.get(prop.getProperty("loginUrl"));
		//driver.get(prop.getProperty("regUrl"));
		
		
		
	}
	

}
