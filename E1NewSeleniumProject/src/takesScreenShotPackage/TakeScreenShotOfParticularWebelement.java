package takesScreenShotPackage;

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
public class TakeScreenShotOfParticularWebelement {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		//click on allow option
		driver.findElement(By.id("confirmBtn")).click();
		//identify the gold coin webelement
		WebElement goldcoin = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
		//use actions class
		Actions  act = new Actions(driver);
		//use movetoelement
		
		act.moveToElement(goldcoin).perform();
		
	//	Click on gold coins
		goldcoin.click();
		//identify the gold coin
		 WebElement coin = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
           File src = coin.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshots/coin.png");
		Files.copy(src, dest);
		
	}
	

}
