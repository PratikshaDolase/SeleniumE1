package methodsOfwebElement;

import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();                            
		driver.manage().window().maximize();                              
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=65sfgie9s4hke"); 
		                                                                  
		WebElement loginButtton = driver.findElement(By.id("loginButton"));
		org.openqa.selenium.Rectangle rect = loginButtton.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		
		
		
		
		
		


	}

}
