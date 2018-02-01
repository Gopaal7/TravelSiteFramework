package com.mns.atl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mns.travelsite.base.TestBase;

public class ExpediaHome extends TestBase {
	
	@FindBy(xpath="//input[@id='package-origin-hp-package']")
	//@FindBy(xpath="//input[@id='flight-origin-hp-flight']")
	WebElement originLocation;
	
	@FindBy(xpath="//input[@id='package-destination-hp-package']")
	
	//@FindBy(xpath="//input[@id='flight-destination-hp-flight']")
	WebElement destinationLocation;
	
	@FindBy(xpath="//button[@id='search-button-hp-package']")
	WebElement searchButton;
	
	@FindBy(xpath="//*[@id='typeaheadDataPlain']")
	WebElement orginAutoComplete;
	
	@FindBy(xpath="//*[@id='typeaheadDataPlain']//li//a")
	WebElement destAutoComplete;
	
	
	@FindBy(xpath="//input[@id='package-departing-hp-package']")
	WebElement departingDate;
	
	
	@FindBy(xpath="//*[@type='button' and @class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
	WebElement calNextButton;
	
	@FindBy(xpath="//div[@class='datepicker-cal-month' ][1]//caption[@class='datepicker-cal-month-header']")
	WebElement departingMonthYear; 
	
	@FindBy(xpath="//input[@id='package-returning-hp-package']")
	WebElement returningDate; 
	
	@FindBy(xpath="//div[@class='datepicker-cal-month' ][2]//caption[@class='datepicker-cal-month-header']")
	WebElement returningMonthYear; 
	WebDriverWait wait;
	
	public ExpediaHome() throws InterruptedException
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
		
	}
	
	public void selectOrgin(String orgin)
	{
	  //  driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
	   // wait.until(ExpectedConditions.visibilityOf(originLocation));
	 
		originLocation.sendKeys(orgin);
		 
		
		//WebElement orginAutoComplete = driver.findElement(By.xpath("//*[@id='typeaheadDataPlain']"));
		
		wait.until(ExpectedConditions.visibilityOf(orginAutoComplete));
		List<WebElement> orginList = driver.findElements(By.xpath("//*[@id='typeaheadDataPlain']//li//a"));
		System.out.println("Origin List:::" + orginList.size());
		
		for (WebElement we :orginList )
		{
			String orginl = we.getAttribute("data-value");
			System.out.println(we.getAttribute("data-value"));
			if(orginl.equalsIgnoreCase("Philadelphia, PA (PHL-Philadelphia Intl.)"))
					{
						we.click();
						break;
					}
			}
		//destinationLocation.sendKeys(destination);
	}
	
	public void selectDest(String dest)
	{
		destinationLocation.sendKeys(dest);
		
		//WebElement destAutoComplete = driver.findElement(By.xpath("//*[@id='typeaheadDataPlain']//li//a"));
		
		wait.until(ExpectedConditions.visibilityOf(destAutoComplete));
		List<WebElement> destList = driver.findElements(By.xpath("//*[@id='typeaheadDataPlain']//li//a"));
		System.out.println("Dest List:::" + destList.size());
		
		for (WebElement we :destList )
		{
			String orginl = we.getAttribute("data-value");
			System.out.println(we.getAttribute("data-value"));
			if(orginl.equalsIgnoreCase("Atlanta, Georgia"))
					{
						we.click();
						break;
					}
			}
	
	}
	
	
	public void departingDate() throws InterruptedException
	{
		//
		//driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		
		departingDate.click();
		//Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//*[@type='button' and @class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).click();
		calNextButton.click();
		
		//Month and year value
		
		
		
		System.out.println("departinDate::" + departingMonthYear.getText());
		
		List<WebElement> departingDays = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][1]//*[@class='datepicker-cal-dates'][1]//button"));
		
		for(int i=0; i<=departingDays.size();i++)
		{
		  if(departingDays.get(i).getText().equals("22"))
				  {
			  		departingDays.get(i).click();
			  		break;
				  }
		}
		
		
	}
	
	public void returningDate() throws InterruptedException
	{
		
		//driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
		returningDate.click();
		//Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//*[@type='button' and @class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).click();
		
		// Month and year value
		
		System.out.println("returningMonthYear::" + returningMonthYear.getText());
		
		List<WebElement> departingDays = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][2]//*[@class='datepicker-cal-dates'][1]//button"));
		
		for(int i=0; i<=departingDays.size();i++)
		{
		  if(departingDays.get(i).getText().equals("19"))
				  {
			  		departingDays.get(i).click();
			  		break;
				  }
		}
		
		searchButton.click();
		
		
	}

}
