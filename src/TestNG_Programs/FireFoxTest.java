package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
	
	public WebDriver driver;
	@Test(priority = 1)
	public void login()
	{
		
	    driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	    driver.quit();
	}
	@Test(priority = 0)
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_java_Jan22\\Binary\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	}
}
