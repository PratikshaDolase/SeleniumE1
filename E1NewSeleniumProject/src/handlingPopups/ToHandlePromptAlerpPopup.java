package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlerpPopup {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://omayo.blogspot.com/");
		 
     	 driver.findElement(By.id("prompt")).click();
		 Thread.sleep(3000);
		 
		 Alert promptAlert = driver.switchTo().alert();
		 
	String prompttext = promptAlert.getText();
	System.out.println(prompttext);
	Thread.sleep(1000);
		 
	promptAlert.sendKeys("MY NAME IS PRATIKSHA");
	Thread.sleep(2000);
	promptAlert.accept();
	driver.close();

	}

}
