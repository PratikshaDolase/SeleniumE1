package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithclickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
//Create the object of Action class
		Actions act = new Actions(driver);
		
		//Use ClickAndHold
		act.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(3000);
		 //use to release method
		 act.release().perform();
	
	}

}
