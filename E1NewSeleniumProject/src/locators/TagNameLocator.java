package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver = new ChromeDriver();//Launch the  Browser
	driver.manage().window().maximize();//to maximize the driver window
	driver.get("file:///C:/Users/MAHESH/Desktop/html/Textbox%20.html");//to launch web application
		Thread.sleep (2000);
		WebElement textbox= driver .findElement(By.tagName("input"));// find password textfield on the webpage.
		
		textbox.sendKeys("manager");// to pass the input to pass textfield
		
		// note :input are passed to username textfiels because it is the first element designed with input tag
	}

}
 