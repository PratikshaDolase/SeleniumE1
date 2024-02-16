package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");

		
		JavascriptExecutor js = (JavascriptExecutor)driver;//to typecast fromwebdriver to javascript 

		//to perform Scrool right operation
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		
		// to perform scroll left Operation
		js.executeScript("window.scrollBy(-250,0)");
        Thread.sleep(2000);
        
        driver.close();
	}

}
