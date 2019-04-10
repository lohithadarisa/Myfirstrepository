import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class FillformusingSendkeys {
	
	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ankpro.com/account/register");
		driver.manage().window().maximize();
	Actions actions=new Actions(driver);
		actions.click(driver.findElement(By.name("Email")))
			   .sendKeys("lohithadarisa@gmail.com" + Keys.TAB)
			   .sendKeys("Abc@ef2" +Keys.TAB)
			   .sendKeys("Abc@ef2" +Keys.TAB)
			   .click(driver.findElement(By.xpath("//input[@class='btn btn-default']")))
			   .build()
			   .perform();
		
	}

}
