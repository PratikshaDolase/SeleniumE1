package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://127.0.0.1/login.do;jsessionid=65sfgie9s4hke");
	
	WebElement password = driver.findElement(By.name("pwd"));


	
	String attributeValue = passTB.getAttribute("class");
	System.out.println(attributeValue);
	
	
	
	
	
	
	
	
	}
	
}
