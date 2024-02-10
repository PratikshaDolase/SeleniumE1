package Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Trellologinpage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/");
		Actions act = new Actions(driver);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("pratikshadolase4@gmail.com");
		driver.findElement(By.xpath("//span[text()='continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Mahika@123");
		driver.findElement(By.xpath("//div[text()='E1])(2)")).click();
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='E1']")));
		driver.findElement(By.xpath("//divtext()='E1'])[1]")).click();
		
		//source Elements
		
		WebElement javaSrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement ManualSrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement APISrc = driver.findElement(By.xpath("//a[text()='API']"));
		WebElement SeleniumSrc = driver.findElement(By.xpath("//a[text()='Selenium'])[1]"));
		
		
		//Target Elements
		
		WebElement mockGivenTarget = driver.findElement(By.xpath("//h2[text()='mock given']"));
		
		WebElement mockpendingTarget = driver.findElement(By.xpath("//h2[text()='mock pending']"));
		WebElement mockscheduledTarget = driver.findElement(By.xpath("//h2[text()='mock scheduled']"));
		
	 
//to perform drag and drop method
	 
  Actions dragAndDrop = act.dragAndDrop(javaSrc, mockGivenTarget);
  dragAndDrop.perform();
  
  act.dragAndDrop(ManualSrc, mockGivenTarget).perform();
  act.dragAndDrop(APISrc, mockGivenTarget).perform();
  act.dragAndDrop(SeleniumSrc, mockscheduledTarget).perform();
  
  // to perform ContextClick Operation 
  WebElement contextElement = driver.findElement(By.xpath("//a[text()='java']"));
  act.contextClick(contextElement).perform();
  
  //to Capture all the options
  List<WebElement> options = driver.findElements(By.xpath("//button[contains@class,'BppQGb2j7TfyB5"));
  
  for (int i = 0;i < options.size();i++){
  System.out.println(options.get(i).getText());

Thread.sleep(1000);
driver.close();
	}

}
}