package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);//to create object of Actions class
		
		 WebElement WebEle = driver.findElement(By.xpath("//selection[text()='Button']"));

		act.contextClick(WebEle).perform();//to perform single click Operation using click method of Action class
         WebElement rightclicklink = driver.findElement(By.partialLinkText("Right Click"));
		 
		 WebElement button1 = driver.findElement(By.xpath("button@[id='btn30']"));
		 
	//	 WebElement buttonOption = driver.findElement(By.xpath("//div[text()='Yes']"));
				 
	//	 WebElement button2 = driver.findElement(By.xpath("button@[id='btn31']"));
		// WebElement buttonOption = driver.findElement(By.xpath("//div[text()='No']"));
				 
	//	 WebElement button3 = driver.findElement(By.xpath("button@[id='btn32']"));
		// WebElement buttonOption = driver.findElement(By.xpath("//div[text()='5']"));
	//	 act.click(button3Option)
				 
	}

}
