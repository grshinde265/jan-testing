package TestNG_Programs;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class KiteDPDemo {
    @Test(dataProvider = "KiteTestData")
    public void LoginZerodha(String Uname, String Pass) throws IOException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://kite.zerodha.com");
		    driver.findElement(By.id("userid")).sendKeys(Uname);
		    driver.findElement(By.id("password")).sendKeys(Pass);
		    
		    // How to capture a screenshot 
		    
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    
	        File srcfile = ts.getScreenshotAs(OutputType.FILE);
	        
	        FileUtils.copyFile(srcfile, new File("D:\\Selenium_java_Jan22\\ScreenShots\\abc.jpeg"));
		}

  @DataProvider(name="KiteTestData", parallel = true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "XA0634", "12345678765" },
      new Object[] { "XA0635", "12345678765" },
      new Object[] { "XA0636", "12345678765" },
      new Object[] { "XA0637", "12345678765" },
      new Object[] { "XA0638", "12345678765" },
      new Object[] { "XA0639", "12345678765" },

    };
  }
}
