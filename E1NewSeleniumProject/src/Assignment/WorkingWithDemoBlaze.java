package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.demoblaze.com/");
driver.findElement(By.xpath("//a[text()='Log in']")).click();
driver.findElement(By.id("loginusername")).sendKeys("pratikshadolase");
driver.findElement(By.id("loginpassword")).sendKeys("pratu");

driver.findElement(By.xpath("//button[text()='Log in'")).click();

driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
Alert alt = driver.switchTo().alert();
Thread.sleep(3000);
alt.accept();
driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
driver.findElement(By.id("name")).sendKeys("pratikshadolase");
driver.findElement(By.id("country")).sendKeys("India");
driver.findElement(By.id("city")).sendKeys("pune");
driver.findElement(By.id("card")).sendKeys("89693456589");
driver.findElement(By.id("month")).sendKeys("march");
driver.findElement(By.id("year")).sendKeys("2024");
driver.findElement(By.id("//button[text()='Purchase']")).click();
driver.findElement(By.id("//button[text()='OK']")).click();
	}
}
