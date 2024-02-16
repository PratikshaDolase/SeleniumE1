package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByBrowserDSpecificationClass {

	public static void main(String[] args) throws IOException {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/login.php/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/Facebook.png");
		Files.copy(src, dest);
	}

}
