package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectionMethod {

	public static void main(String[] args) throws InterruptedException {  
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("file:///C:/Users/MAHESH/Desktop/html/Dropdown.html");
		 
		 WebElement singleselectDD = driver.findElement(By.id("menu"));
		 Select sel = new Select(singleselectDD);
		 
		 // To select an option by using the index value
		 sel.selectByIndex(6);
		 Thread.sleep(2000);
		 
		 //To select an option by using the value of option
		 sel.selectByValue("v6");
		 Thread.sleep(2000);
		 
		 //To select an option by using the value of the option
		 sel.selectByVisibleText("dosa");
		 Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}

}
