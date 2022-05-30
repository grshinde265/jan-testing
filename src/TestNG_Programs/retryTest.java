package TestNG_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class retryTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.edge.driver", "D:\\Selenium_java_Jan22\\Binary\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(275));
	    WebElement CreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    CreateAcc.click();
	    
	    WebElement SignUp = driver.findElement(By.xpath("//div[text()='Sign Up']"));
	    Assert.assertTrue(SignUp.isDisplayed());
	    }
  @Test
  public void s() {
	  Assert.assertEquals(true, true);
  }
}
