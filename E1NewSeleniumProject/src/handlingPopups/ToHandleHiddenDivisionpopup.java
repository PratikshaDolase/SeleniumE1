package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.makemytrip.com/");
		 		 Thread.sleep(3000);

    	 driver.findElement(By.xpath("//span[text()='Depature']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[text()='March2024']/.ancestor::div@class='DayPicker-month']/decendant::p[text()='25']\"))")).click();

		 Thread.sleep(2000);
		 driver.close();

	}

}
