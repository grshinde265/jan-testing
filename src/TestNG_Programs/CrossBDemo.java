package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBDemo {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Selenium_java_Jan22\\Binary\\msedgedriver.exe");
		    driver = new EdgeDriver();
		}
	}
	
	@Test
	public void LoginZerodha() {
		driver.get("https://kite.zerodha.com");
	    driver.findElement(By.id("userid")).sendKeys("XA0634");
	    driver.findElement(By.id("password")).sendKeys("12346543");
	}
}
