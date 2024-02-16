package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiondClassAndTakesScreenShotSMethod {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.bluestone.com/");

//Actions act = new Actions(driver);
 WebElement coinsLink = driver.findElement(By.partialLinkText("title=Coins"));
 coinsLink.click();
 
 WebElement coinElement = driver.findElement(By.id("id=\"pid_5920\""));
 boolean result = coinElement.isDisplayed();
 System.out.println(result);


	}

}
