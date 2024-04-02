package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithcontextClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		//identify the right click button
	 WebElement rightbutton = driver.findElement(By.id("btn30"));
	 //Create the Object of Actions class
	 
	 Actions act = new Actions(driver);
	 
	 ///use to contextClickMethod
	 act.contextClick(rightbutton).perform();
	}

}
