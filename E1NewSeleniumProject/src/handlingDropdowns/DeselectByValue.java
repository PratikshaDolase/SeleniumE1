package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://demoapps.qspiders.com/");
		//click on ui testing concept 
		driver.findElement(By.xpath("p[text()='UI Testing concepts']")).click();	
	//	clcik on dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//identify  the particular  dropdown 
		WebElement dropdown = driver.findElement(By.id("select3"));
		//create the object  of select class
		 Select s = new Select(dropdown);
	  //select the options 
		 s.selectByIndex(1);
		 s.selectByIndex(2);
		 s.selectByIndex(3);
		 //deselect the options by using DeselectByValue
		 s.deselectByValue("germany");
		  s.deselectByValue("United Arab Emirates");

	}

}
