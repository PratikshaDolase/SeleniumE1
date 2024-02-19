package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://omayo.blogspot.com/");
		 
		 // to generate alert popup
		 driver.findElement(By.id("alert1")).click();
		 Thread.sleep(3000);
		 
		 //to switch the control to alert popup
	   Alert alertpopup = driver.switchTo().alert();
	   
	   //to click on ok button from the popup
	//   alertpopup.accept();
		 
		 
		 alertpopup.dismiss();
		 driver.close();
		 
		 
		 

	}

}
