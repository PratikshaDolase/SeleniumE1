package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fireflink.com/");
		Thread.sleep(2000);
		
		
		WebElement signInlink = driver.findElement(By.partialLinkText(" Sign In"));
		 signInlink.click();
		 Thread.sleep(2000);
		 
		 WebElement email = driver.findElement(By.xpath(" //input[@name= 'emailId']"));
		 email.sendKeys(" qspiders@gmail.com");
		 Thread.sleep(1000);
		 
		 WebElement password = driver.findElement(By.xpath("//input[@id='mui-2]"));
		 email.sendKeys("password@123");
		 Thread.sleep(1000);
		 
		 WebElement loginButton = driver.findElement(By.xpath("//button[@'submit']"));
		 loginButton.click();
		 
		 Thread.sleep(1000);
		 driver.close();
		 

		 

		
		
		
		
		
		
		
		

	}

}
