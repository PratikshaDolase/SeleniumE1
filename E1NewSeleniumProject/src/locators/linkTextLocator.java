package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
   WebElement forgetPass = driver.findElement(By.linkText("Forgotten password"));
   forgetPass.click();
   

}


	}


