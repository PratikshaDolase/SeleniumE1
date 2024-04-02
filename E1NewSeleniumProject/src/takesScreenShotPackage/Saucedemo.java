package takesScreenShotPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.saucedemo.com/");
		 driver.findElement(By.name("username")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 
		 driver.findElement(By.xpath("//button[@id='login-button']")).click();
		 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		 
	
	//	driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		 

}
}										