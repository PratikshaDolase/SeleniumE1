package handlingDropdowns;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class removeDuplicateUsingHasset {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("file:///C:/Users/MAHESH/Desktop/html/Dropdown.html");
		 
		 WebElement singleselectDD = driver.findElement(By.id("menu"));
		
		
		Select sel = new Select(singleselectDD);
    HashSet<String> hs = new HashSet<String>();
	
	
	List<WebElement> Options = sel.getOptions();
	
	for(WebElement we:Options)
	{
		String textToInsert = we.getText();
		hs.add(textToInsert);
		
	}
		for(String text:hs)
		{
	System.out.println(text);
		}


	}

}
