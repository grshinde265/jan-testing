package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kitedpinherited {
	 @Test(dataProvider = "KiteTestData",dataProviderClass = DP.class)
	    public void LoginZerodha(String Uname, String Pass) {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.get("https://kite.zerodha.com");
			    driver.findElement(By.id("userid")).sendKeys(Uname);
			    driver.findElement(By.id("password")).sendKeys(Pass);
			}

}
