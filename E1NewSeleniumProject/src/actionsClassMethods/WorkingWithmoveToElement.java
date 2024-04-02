package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithmoveToElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		//identify the link
	WebElement menlink = driver.findElement(By.xpath("//li[@class = 'men p-4r relative']"));
		//create the object of actions class
		 Actions act = new Actions(driver);
		 
		//use MoveToElement
		 act.moveToElement(menlink).perform();
		}

}
