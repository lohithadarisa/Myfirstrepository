import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/students/actions");
		//Create object of Actions class and pass driver as parameter
		Actions actions=new Actions(driver);
		//click action without parameter
		//actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Home')]")))
			//	.click()
				//.build()
				//.perform();
		//Thread.sleep(10000);
		//System.out.println("Click action without parameter");
		actions.click(driver.findElement(By.xpath("//a[contains(text(),'Home')]")))
		      .build()
		      .perform();
		System.out.println("Click action with parameter");
	
}}
