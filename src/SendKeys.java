import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/students/actions");
		driver.manage().window().maximize();
	Actions actions=new Actions(driver);
		//actions.sendKeys(Keys.END)
			//	.perform();
		//Thread.sleep(5000);
		//actions.sendKeys(Keys.HOME)
		//.perform();
		actions.sendKeys(driver.findElement(By.name("click")),Keys.ENTER)
			  .perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
