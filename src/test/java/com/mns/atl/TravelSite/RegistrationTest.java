package com.mns.atl.TravelSite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mns.atl.excelutility.Xls_Reader;
import com.mns.atl.pages.Registration;
import com.mns.travelsite.base.TestBase;



public class RegistrationTest extends TestBase {
	
	Registration registration;
	String firstName;
	String lastName;
	Double phoneD;
	String phone;
	String email;
	String password;
	String confirmPassword;
	public RegistrationTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		driver.get(prop.getProperty("regUrl"));
		registration = new Registration();
		
	}
	
	
	
	@Test
	public void testRegistration()   throws Exception
	{
		readExcel();
		registration.registrationUser(firstName,lastName,phone,email,password,confirmPassword);
	}

	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	public void readAllExcelData() throws Exception
	{
	File src = new File("C:\\SeleniumProjects\\TravelSite\\src\\main\\java\\com\\mns\\atl\\data\\Register.xlsx");
		
		List<Registration> registrationList = new ArrayList<Registration>();
		
		Registration reg = new Registration();
	
		FileInputStream fs = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
	
		XSSFRow row=  sheet1.getRow(1);
			int totalCols=   row.getLastCellNum();
		
			System.out.println("Total no of columns " + totalCols);
			
		//sheet1.getLastRowNum();
		
		//String str=	sheet1.getRow(2).getCell(1).toString();
		//System.out.println(str);
		
		
		for(int i=0; i<=sheet1.getLastRowNum();i++)
		{
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println(sheet1.getRow(i).getCell(j)); 
				if(j==0)
					firstName=sheet1.getRow(i).getCell(j).getStringCellValue();
				if(j==1)
					lastName= sheet1.getRow(i).getCell(j).getStringCellValue();
				if(j==2)
					phoneD= sheet1.getRow(i).getCell(j).getNumericCellValue();
				if(j==3)
					email= sheet1.getRow(i).getCell(j).getStringCellValue();
				if(j==4)
					password= sheet1.getRow(i).getCell(j).getStringCellValue();
				if(j==5)
					confirmPassword= sheet1.getRow(i).getCell(j).getStringCellValue();
				
				 phone=	phoneD.toString();
				testRegistration();
			}
			System.out.println("---------------------------------");

		}
		
		
		
		

	}

	
	
	public void readExcel()
	{
		Xls_Reader xreader = new Xls_Reader("C:\\SeleniumProjects\\TravelSite\\src\\main\\java\\com\\mns\\atl\\data\\Register.xlsx");
		//int rowCount =  xreader.getRowCount("Register");
		
		 firstName = xreader.getCellData("Register", 0, 2);
		 lastName = xreader.getCellData("Register", 1, 2);
		 phone = xreader.getCellData("Register", 2, 2);
		 email = xreader.getCellData("Register", 3, 2);
		 password = xreader.getCellData("Register", 4, 2);
		 confirmPassword = xreader.getCellData("Register", 5, 2);
		
	}

}
