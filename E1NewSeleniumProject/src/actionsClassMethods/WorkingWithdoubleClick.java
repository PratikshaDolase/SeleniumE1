package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithdoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
		//identify the yes button
		 WebElement yesButton = driver.findElement(By.xpath("btn30"));
		 
		 //Create the object of Actions class
		 Actions act = new Actions(driver);
		 
		 //use Doubleclick
		 act.doubleClick(yesButton).perform();
		 
		 

	}

}
