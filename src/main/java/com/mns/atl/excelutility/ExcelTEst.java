package com.mns.atl.excelutility;

import org.apache.poi.hssf.model.ConvertAnchor;
import org.apache.poi.ss.usermodel.DataFormatter;

import com.gargoylesoftware.htmlunit.javascript.host.arrays.Int32Array;

public class ExcelTEst {
	
	
	public static void main(String[] args)
	{
	
		//Xls_Reader xreader = new Xls_Reader("/TravelSite/src/main/java/com/mns/atl/data/Register.xlsx");
		
		Xls_Reader xreader = new Xls_Reader("C:\\SeleniumProjects\\TravelSite\\src\\main\\java\\com\\mns\\atl\\data\\Register.xlsx");
		
		int rowCount =  xreader.getRowCount("Register");
		
		int colCount = xreader.getColumnCount("Register");
		
		System.out.println("row count " + rowCount + "--- Total Columns" + colCount );
		DataFormatter fmt = new DataFormatter();
		
		
		String firstName = xreader.getCellData("Register", 0, 2);
		String lastName = xreader.getCellData("Register", 1, 2);
		String phone =xreader.getCellData("Register", 2, 2);
		String email = xreader.getCellData("Register", 3, 2);
		String password = xreader.getCellData("Register", 4, 2);
		String confirmPassword = xreader.getCellData("Register", 5, 2);
		
		
		
		System.out.println("firstName::" + firstName);
		System.out.println("lastName::" + lastName);
		System.out.println("phone::" + phone);
		System.out.println("email::" + email);
		System.out.println("pasword::" + password);
		System.out.println("conpassword::" + confirmPassword);
	}

}
