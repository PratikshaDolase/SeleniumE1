


package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/MAHESH/Desktop/html/Textbox%20.html");
    Thread.sleep(2000);
     WebElement PassTextBox = driver.findElement(By.className("password"));
    		
    PassTextBox.sendKeys("manager");//to pass input to password textbox
	}
}