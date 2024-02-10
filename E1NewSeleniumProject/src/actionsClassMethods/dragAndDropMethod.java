package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("Drag Position")).click();
		driver.findElement(By.xpath("//section[text() = 'Mobile charger']"));
		driver.findElement(By.xpath("//section[text() = 'Laptop charger']"));
		
		WebElement MobileChargerSouce = driver.findElement(By.xpath("//div[text()= 'Mobile Cover']"));
		WebElement LaptopChargerSource = driver.findElement(By.xpath("//div[text()= 'Laptop Cover']"));
		
		WebElement MobileCoverSource = driver.findElement(By.xpath("//div[text()= 'Mobile Cover']"));
		WebElement LaptopCoverSource = driver.findElement(By.xpath("//div[text()= 'Laptop Cover;]"));
		
		//	
			WebElement MobileAccessoriesSourceTarget = driver.findElement(By.xpath("//div[text()= Mobile Accessories"));
         WebElement LaptopAccessoriesSourceTarget= driver.findElement(By.xpath("//div[text()= Laptop Accessories"));
		
         //to dragand drop the webelements into respective target area
		Actions act = new Actions(driver);
		act.dragAndDrop(MobileCoverSource, MobileAccessoriesSourceTarget).perform();
		act.dragAndDrop(LaptopCoverSource, LaptopAccessoriesSourceTarget).perform();
		act.dragAndDrop(LaptopChargerSource, LaptopAccessoriesSourceTarget).perform();
		act.dragAndDrop(MobileChargerSouce, MobileAccessoriesSourceTarget).perform();
}
}
