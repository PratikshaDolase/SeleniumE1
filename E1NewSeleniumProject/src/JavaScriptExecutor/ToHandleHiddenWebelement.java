package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ToHandleHiddenWebelement {

	
	public static void main(String[] args, Object JavascriptExecutor) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement hiddenElement = driver.findElement(By.xpath("//input[@name='custom_gender]"));
         Object js = (JavascriptExecutor).driver;  
      js.executeScript("arguments[0].value='Qspiders'",hiddenElement);
 
	}}

