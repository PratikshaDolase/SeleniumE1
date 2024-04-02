package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeSCoffullWebpageOfBluestone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.bluestone.com/jewellery/2gram24ktgoldcoins.html");
		 
	WebElement coin = driver.findElement(By.xpath("//div[@id='page-title']"));
	
	  File src = coin.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/Webpage.png");
Files.copy(src, dest);
	

			}
	}


