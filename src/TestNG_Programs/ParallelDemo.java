package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
public WebDriver driver;
	@Test
	public void ChromeTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
	    driver = new ChromeDriver();
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	    driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	    driver.quit();
	}
	
	@Test 
	public void EdgeTest()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium_java_Jan22\\Binary\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
	    driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	    driver.quit();
	}
	@Test
	public void FirefoxTest()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_java_Jan22\\Binary\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	    driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	    driver.quit();
	}
}
