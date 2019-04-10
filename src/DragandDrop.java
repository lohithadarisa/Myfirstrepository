import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/students/actions");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		//actions.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")))
			//	.build()
			//	.perform();
		
		//Thread.sleep(5000);
		//driver.quit();
	actions.dragAndDropBy(driver.findElement(By.id("draggable")),150,20)
	       .build()
	       .perform();
	Thread.sleep(5000);
			driver.quit();
	
	

	}

}
