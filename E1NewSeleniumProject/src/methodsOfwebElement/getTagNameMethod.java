package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagNameMethod {

	public static void main(String[] args) {
		
		       WebDriver driver = new ChromeDriver();                                 
		       driver.manage().window().maximize();                                   
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
		    driver.get("http://127.0.0.1/login.do;jsessionid=65sfgie9s4hke");     
		    
		    WebElement usn = driver.findElement(By.name("username"));
		    String usnTag = usn.getTagName();
		  System.out.println(usnTag);                                            
		                                                                              
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
