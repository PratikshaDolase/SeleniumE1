package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopApplication {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);

driver.findElement(By.xpath("//a[text()='Log in']")).click();
//driver.findElement(By.name("ico-login")).click();
driver.findElement(By.id("Email")).sendKeys("pratikshadolase8	@gmil.com");
driver.findElement(By.name("Password")).sendKeys("pratuu");
driver.findElement(By.xpath("//input[@value ='Log in']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//u1[@class= 'top-menu;]/descendant::a[contains(text(),;Books')]")).click();
//driver.findElement(By.xpath("//h2[@class='product-title']/ancestor::div[@class='product-"))
		//driver.findElement(ByLinkText)
	}

}