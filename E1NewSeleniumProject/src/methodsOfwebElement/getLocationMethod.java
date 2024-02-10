package methodsOfwebElement;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.jsp");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
	point point = loginButton.getLocation();
		  int x_axis = point.getX();
		   int y_axis = point.getY();
		  System.out.println("x axis is"+x_axis+" "+"y axis is:"+y_axis);
		   
		   
	}

}
