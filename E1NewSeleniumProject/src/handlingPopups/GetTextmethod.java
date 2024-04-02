package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		 
driver.findElement(By.xpath("//a[text()='confirm']")).click();

driver.findElement(By.id("buttonAlert5")).click();
Alert alt = driver.switchTo().alert();
//use GetText()

 String text = alt.getText();
 
 System.out.println(text);
 Thread.sleep(3000);
 alt.dismiss();
	}

}
