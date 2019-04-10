import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class KeyDownandKeyUp {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.uitestpractice.com/students/actions");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	//actions.keyDown(Keys.CONTROL)
		//	.click(driver.findElement(By.name("one")))
			//.click(driver.findElement(By.name("four")))
			//.click(driver.findElement(By.name("seven")))
			//.keyUp(Keys.CONTROL)
			//.build()
			//.perform();
	actions.keyDown(driver.findElement(By.name("one")),Keys.CONTROL)
	       .keyDown(driver.findElement(By.name("four")),Keys.CONTROL)
	       .keyUp(driver.findElement(By.name("seven")),Keys.CONTROL)
	       .build()
	       .perform();
	       
	
	Thread.sleep(10000);
	driver.quit();
}}
