package methodsofwebdriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();//to navigate backward
		
		Thread.sleep(1000);
		
		driver.navigate().forward();//to navigate forward
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();//to refresh the web page

	}

}
