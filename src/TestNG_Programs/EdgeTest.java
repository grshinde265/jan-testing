package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
	@Test 
	public void EdgeTest()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium_java_Jan22\\Binary\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
	    driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	    driver.quit();
	}
}
