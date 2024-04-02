package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import actionsClassMethods.clickAndHoldMethod;
import methodsOfwebElement.ClickMethod;

public class Bluestone {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/");
		//clcick on allow option
		driver.findElement(By.id("confirmBtn")).click();
		
	 WebElement goldcoin = driver.findElement(By.id("//a[text()='Gold Coins '"));
	//use actions class
	 Actions  act = new Actions(driver);
		//use movetoelement
		
		act.moveToElement(goldcoin).perform();
		
	//	Click on gold coins
		goldcoin.click();			

	// click on 2gram gold coin
				
				WebElement coin = driver.findElement(By.xpath("//Li[@class='active']"));
				WebElement coin1 = driver.findElement(By.xpath("//div[@class='browse-title col-xs-12 ']"));
		        File src = coin1.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/link.png");
			Files.copy(src, dest);
				
		
}}