package methodsOfwebElement;

import java.awt.TextField;
import java.time.Duration;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class isEnabledMethod {

	public static void main(String[] args) {
		
      	WebDriver driver = new ChromeDriver();                                  
			driver.manage().window().maximize();                                    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));      
            driver.get("https://demoapps.qspiders.com/ui/login?scenario=1");
	      	driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		    WebElement WebElementnameTextfield = driver.findElement(By.id("Name"));
         	Boolean result = nameTextField.isEnabled();
            System.out.println(result);

		
		
		
		
		
		
		
		
		
		

	}

}
  