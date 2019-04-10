package com.datadriventest;

import ExcelUtility.Xls_Reader;

public class ExcelFeaturestes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the data from excel

		Xls_Reader reader=new Xls_Reader("C:\\Users\\Admin\\eclipse-workspace\\Actions\\src\\com\\testdata\\Excel Data.xlsx");
		
		//before addding sheet first check if sheet exists or not and then add --always
		
		if(!reader.isSheetExist("Homepagesheet"))
		{
			reader.addSheet("Homepagesheet");
		}
		
		int Colcount=reader.getColumnCount("RegTestData");
		
		System.out.println("total coulumns:" +Colcount);
		System.out.println(reader.getCellRowNum("RegTestData", "FIRSTNAME","Rithvika"));
	
	}

}
