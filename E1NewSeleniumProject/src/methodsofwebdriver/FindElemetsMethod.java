package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class FindElemetsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement partofforgotpass = driver.findElement(By.id(" ERWdkc"));
		partofforgotpass.sendKeys("bikes");
		Thread.sleep(1000);
		driver.close();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class= 'wM6W7d']"));
		
	}

}
