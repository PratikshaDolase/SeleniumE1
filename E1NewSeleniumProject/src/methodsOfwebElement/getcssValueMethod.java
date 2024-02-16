package methodsOfwebElement;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssValueMethod {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
		WebElement loginElement = driver.findElement(By.id("loginButton"));//to find login button and store in a variable
	    String cssValue = loginButton.getCssValue("background");//to get css value used for background
        System.out.println(cssValue);//to print  the recived  value in the concle
				
				
	    String Color = loginButton.getCssValue("color");
		System.out.println(color);
	}

}
