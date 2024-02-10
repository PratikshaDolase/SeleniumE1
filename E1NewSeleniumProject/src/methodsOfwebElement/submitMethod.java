package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys("Qspider");
		driver.findElement(By.name("password")).sendKeys("dont know");
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='login']"));
		loginButton.submit();
	
		
		
	}

}
