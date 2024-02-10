package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class isDisplayedMethod {

	public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();                                 
		    driver.manage().window().maximize();                                   
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
             driver.get("https://www.instagram.com/accounts/login/");
		                                                                           
		     WebElement loginButton = driver.findElement(By.xpath("//div[text()='login']"));
		      boolean result = loginButton.isDisplayed();
		
		System.out.println(result);
		
		
		
		
		
	}

}
