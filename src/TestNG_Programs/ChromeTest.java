package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test(threadPoolSize = 5, invocationCount = 5, timeOut = 40000)
	public void ChromeTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	    driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	    driver.quit();
	}
}
