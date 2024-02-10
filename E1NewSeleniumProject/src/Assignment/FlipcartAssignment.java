package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("q")).sendKeys("hp laptop");
	driver.findElement(By.xpath("//button[@type'submit']")).click();
	Thread.sleep(1000);
	
	

	driver.findElement(By.xpath("//div[text()='brand']")).click();
	driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::_24_Dny'])]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[text() = corei5']/preceding-sibling::div[@_24_Dny']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.name(By.xpath("//div[text()= 'Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='4+&above]/preceding-sibling::div[@class='_24_Dny']")).click(); 
	Thread.sleep(2000);
	
for(int i=0; i<laptops.size()i++)
{
	String op = laptops.get(i).getText();
	for (int)
}
			
	
	
	
	
	
	driver.findElement(By.xpath("//div[text()='operatingsystem']" ).click();
			driver.findElement(By.xpath("//div[text()='windows11'/preceding-sibling::div[@class'_24_Dny'"])).click();
			
			
			driver.findElement(By.xpath())
			
	
	
	

}
	}


