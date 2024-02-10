package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	private static final By checkButton = null;
	private static final WebElement CheckButton = null;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//to launch chrome browser
		driver.manage().window().maximize();//to maximize the browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// to declare implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//to declare explicit wait
		driver.get("https://www.shoppersstack.com/");// tp launch the application
		
		driver.findElement(By.xpath("//spam[text()='APPLE iphone 14 pro']")).click();
		
		driver.findElement(By.id("check Delivary")).sendKeys("411033");
		
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='check']"))));
		driver.findElement(By.xpath("//button[@id='check']")).click();
		
		//2nd way to use explicit wait or provide waiting condition
		
	//	WebElement checkButton = driver.findElement(By.xpath("button[@id='check']"));
		//wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		//CheckButton.click();
	 
	 
		
	
		
	}

}
