package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	private static final String LoginButton = null;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// to declare implicit wait
		driver.get("http://127.0.0.1/login.do;jsessionid=65sfgie9s4hke");
		
		WebElement loginButon = driver.findElement(By.id("loginButton"));
		loginButon.click();
	}
}
