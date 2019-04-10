import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.uitestpractice.com/students/actions");
	//Create object of Actions class and pass driver as parameter
	Actions actions=new Actions(driver);
	//actions.moveToElement(driver.findElement(By.id("div2")))
		//   .build()
		  // .perform();
	//moveToELement with x and y offset values (calculates from top left corner)
	actions.moveToElement(driver.findElement(By.id("div2")),20,20)
	       .build()
	        .perform();
	Thread.sleep(5000);
	driver.quit();
	System.out.println("Mouse control moved to webelement path");
	
		}
}
