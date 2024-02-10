package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator{

	public static void main(String[] args) throws InterruptedException {
		
  WebDriver driver=new ChromeDriver();
  
  driver.manage().window().maximize();
  driver.get("https://www.instagram.com/?hl=en");
  Thread.sleep(2000);
 
  //to find/locate passwordtextbox and passthe input
  WebElement  usnTB= driver.findElement(By.cssSelector("input[aria-label]='Phone number, username, or email']"));
  usnTB.sendKeys("qspiders");
  Thread.sleep(1000);
  
  //to click on login button
  WebElement passTB= driver.findElement(By.cssSelector("input[type='password']"));
  usnTB.sendKeys("password@123");
  Thread.sleep(1000);
  
  WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

  loginButton.click();
  
  
		  
  
  	
  
	}
	

}
