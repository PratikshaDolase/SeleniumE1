package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithdragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		//identify the drag Webelement
		
		WebElement drag = driver.findElement(By.xpath("//div[text() = 'Mobile Charger']"));
		
		//identify the drop Position
		WebElement drop = driver.findElement(By.xpath("//div[text()= 'Mobile Accessories']"));

		//create the object of nactions class
		Actions act = new Actions(driver);
		//use dragAndDrop()
		act.dragAndDrop(drag, drop).perform();
		
        WebElement drag1 = driver.findElement(By.xpath("//div[text() = 'Laptop Cover']"));
		
		//identify the drop Position
		WebElement drop1 = driver.findElement(By.xpath("//div[text()= 'Laptop Accessories']"));

		//create the object of nactions class
		Actions act1 = new Actions(driver);
		//use dragAndDrop()
		act1.dragAndDrop(drag1, drop1).perform();
		
  		
         WebElement drag2= driver.findElement(By.xpath("//div[text() = 'Laptop Charger']"));
		
		//identify the drop Position
		WebElement drop2= driver.findElement(By.xpath("//div[text()= 'Laptop Accessories']"));

		//create the object of actions class
		Actions act2 = new Actions(driver);
		//use dragAndDrop()
		act2.dragAndDrop(drag2, drop2).perform();
		
		
        WebElement drag3 = driver.findElement(By.xpath("//div[text() = 'Mobile Cover']"));
		
		//identify the drop Position
		WebElement drop3 = driver.findElement(By.xpath("//div[text()= 'Mobile Accessories']"));

		//create the object of nactions class
		Actions act3 = new Actions(driver);
		//use dragAndDrop()
		act.dragAndDrop(drag3, drop3).perform();
		 
		

	}

}
