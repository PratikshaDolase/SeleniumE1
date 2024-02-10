package handlingDropdowns;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class removeTheDuplicates {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("file:///C:/Users/MAHESH/Desktop/html/Dropdown.html");
		 
		 WebElement singleselectDD = driver.findElement(By.id("menu"));
		
		 Select sel = new Select(singleselectDD);
	
	TreeSet<String> ts = new TreeSet<String>();
	
	List<WebElement> Options = sel.getOptions();
	
	for(WebElement we:Options)
	{
		String textToInsert = we.getText();
		ts.add(textToInsert);
		
	}
		for(String text:ts)
		{
	System.out.println(text);
		}
}
}
