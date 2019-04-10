import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ClickAndHoldAndrelease {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/students/actions");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		//*actions.moveToElement(driver.findElement(By.name("one")))
				  //.clickAndHold()
				   //.moveToElement(driver.findElement(By.name("seven")))
		           //.release()
		           //.build()
		           //.perform();//*
		
		actions.clickAndHold(driver.findElement(By.name("one")))
		       .release(driver.findElement(By.name("seven")))
		       .build()
		       .perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

	private static Actions clickAndHold() {
		// TODO Auto-generated method stub
		return null;
	}}
