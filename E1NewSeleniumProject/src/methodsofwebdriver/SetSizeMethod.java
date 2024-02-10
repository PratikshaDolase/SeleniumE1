package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Dimension targetSize = new Dimension(900,500);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}
