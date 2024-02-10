package takesScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemoteWebdriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
	
		File src = driver.getScreenshotAs(OutputType.FILE);// to take the screenshot of the Webpage

		File dest = new File("./screenshots/google.png");// to specify the location ,name and extension of

		Files.copy(src, dest);// to save the Screenshot into ScreenShots folder

	}
}

	


