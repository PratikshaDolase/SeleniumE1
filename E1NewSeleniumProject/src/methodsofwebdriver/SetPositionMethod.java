    package methodsofwebdriver;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
      Thread.sleep(1000);   
      driver.manage().window().maximize();
       Thread.sleep(2000);
      Point targetPoint = new Point(400,200);
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.close();
      
      
      
       

	}

} 