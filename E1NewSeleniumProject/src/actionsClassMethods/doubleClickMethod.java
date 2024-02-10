package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=1");
		driver.findElement(By.xpath("//section[text()='Button']"));
		driver.findElement(By.xpath("Double Click"));
		
	  WebElement yesButton1 = driver.findElement(By.xpath("btn20"));
	 WebElement noButton2 = driver.findElement(By.xpath("btn23"));
	  WebElement ratingButton1 = driver.findElement(By.xpath("btn26"));
	 
	  Actions act = new Actions(driver);//to create the object of actions class
	  
	  act.doubleClick(yesButton1).perform();// to perform double click operation 
	  act.doubleClick(noButton2).perform();
	 act.doubleClick(ratingButton1).perform();
	  
	  
	 
	}

}
