package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignIn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
        WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
								
		Select daySelect = new Select(dayDropDown);
        boolean result = daySelect.isMultiple();
			
			
			System.out.println("dropdown is multiple?:" + result);
             List<WebElement> dayOptions = daySelect.getOptions();
 
       for(WebElement we : dayOptions)
     {
	 System.out.println(we.getText());
     }
     daySelect.selectByIndex(16);
     System.out.print("-------------------------------------------------------------");
  	 System.out.println();
	 
	 Select monthSelect = new Select(monthDropDown);
	 boolean result2 = monthSelect.isMultiple();
	 System.out.println("month DropDown is multiple?:"+result2);
	 List<WebElement> monthOptions = monthSelect.getOptions();
	 
     for(WebElement we : monthOptions)

	 
	 {
		 System.out.println(we.getText());
	 }
		 monthSelect.selectByVisibleText("march");
		 System.out.print("-----------------------------------------------------");
		 System.out.println();
		 
	 
	 
	 Select yearSelect = new Select(yearDropDown);
	 boolean result3 = yearSelect.isMultiple();
	 System.out.println("year DropDown is multiple?:"+result3);
	 List<WebElement> yearOptions = yearSelect .getOptions();
	 
	 for (WebElement we : yearOptions)
	 {
		 System.out.println(we.getText());
		 
	 }
	yearSelect.selectByVisibleText("2024");
	 System.out.print("-----------------------------------------------------");
	 System.out.println();
  }
       

}

