package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ExcelUtility.Xls_Reader;

public class Parametrizetest {
	
	public static void main(String args[]) {
		

		// webdriver code

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		
	//DATA DRIVEN FRAMEWORK--DRIVING THE TEST DATA FROM EXCEL FILES (OR SOME OTHER FILES)
		//DATA DRIVEN IS ALSO CALLED PARAMETERIZATION.
	
		//get the data from excel

Xls_Reader reader=new Xls_Reader("C:\\Users\\Admin\\eclipse-workspace\\Actions\\src\\com\\testdata\\Excel Data.xlsx");
	
int rowcount=reader.getRowCount("RegTestData");
System.out.println(+rowcount);

reader.addColumn("RegTestData","Status");//adding new coulumn in excel sheet


//parameterizaton

for (int rownum=2; rownum<=rowcount; rownum++)
{
	System.out.println("******");
	String FIRSTNAME=reader.getCellData("RegTestData", "FIRSTNAME", rownum);
	System.out.println(FIRSTNAME);

	String LASTNAME=reader.getCellData("RegTestData","LASTNAME", rownum);
	System.out.println(LASTNAME);

	String ADDRESS1=reader.getCellData("RegTestData", "ADDRESS1",rownum);
	System.out.println(ADDRESS1);

	String ADDRESS2=reader.getCellData("RegTestData", "ADDRESS2",rownum);
	System.out.println(ADDRESS2);

	String CITY =reader.getCellData("RegTestData", "CITY ", rownum);
	System.out.println(CITY );

	String STATE =reader.getCellData("RegTestData", "STATE ", rownum);
	System.out.println(STATE );

	String ZIPCODE =reader.getCellData("RegTestData", "ZIPCODE ", rownum);
	System.out.println(ZIPCODE );

	String Email =reader.getCellData("RegTestData", "EMAILADDRESS ", rownum);
	System.out.println(Email );
	
//enter the data	

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
	
	reader.setCellData("RegTestData","Status", rownum, "pass"); //write the data into cell
	

	
}

	
	}
}
	
	

