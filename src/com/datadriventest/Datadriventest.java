package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExcelUtility.Xls_Reader;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriventest {
	public static void main (String args[]) {
		
		//get test data from excel
	
Xls_Reader reader=new Xls_Reader("C:\\Users\\Admin\\eclipse-workspace\\Actions\\src\\com\\testdata\\Excel Data.xlsx");

String FIRSTNAME=reader.getCellData("RegTestData", "FIRSTNAME", 2);
System.out.println(FIRSTNAME);

String LASTNAME=reader.getCellData("RegTestData","LASTNAME", 2);
System.out.println(LASTNAME);

String ADDRESS1=reader.getCellData("RegTestData", "ADDRESS1", 2);
System.out.println(ADDRESS1);

String ADDRESS2=reader.getCellData("RegTestData", "ADDRESS2", 2);
System.out.println(ADDRESS2);

String CITY =reader.getCellData("RegTestData", "CITY ", 2);
System.out.println(CITY );

String STATE =reader.getCellData("RegTestData", "STATE ", 2);
System.out.println(STATE );

String ZIPCODE =reader.getCellData("RegTestData", "ZIPCODE ", 2);
System.out.println(ZIPCODE );

String Email =reader.getCellData("RegTestData", "EMAILADDRESS ", 2);
System.out.println(Email );

// webdriver code

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

driver.findElement(By.xpath("//input[@id='firstname']")).clear();
driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(FIRSTNAME);

driver.findElement(By.xpath("//input[@id='lastname']")).clear();
driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LASTNAME);

driver.findElement(By.xpath("//input[@id='address1']")).clear();
driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(ADDRESS1);

driver.findElement(By.xpath("//input[@id='address2']")).clear();
driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(ADDRESS2);

driver.findElement(By.xpath("//input[@id='city']")).clear();
driver.findElement(By.xpath("//input[@id='city']")).sendKeys(CITY );

Select select=new Select(driver.findElement(By.xpath("//*[@id='state']")));
select.selectByVisibleText(STATE);

driver.findElement(By.xpath("//input[@id='zip']")).clear();
driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(ZIPCODE );

driver.findElement(By.xpath("//input[@id='email']")).clear();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);


}

}