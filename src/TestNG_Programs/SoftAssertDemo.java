package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	public WebDriver driver;
	public SoftAssert sassert;
	@Test
	public void CheckTitleTest()
	{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://demoqa.com");
    
    String ExpectedTitle = "Free QA Automation Tool for Every one";
    String ActualTitle = driver.getTitle();
    
    sassert = new SoftAssert();
    sassert.assertEquals(ActualTitle, ExpectedTitle,"Titles of the website do not match");
    System.out.println("This is the default Assert provided by TestNg");
    Reporter.log("Default Assert behavior is like if test fails then terminate the method and navigate to other method",true);
    sassert.assertAll();
	}
    @Test
    public void LogoTest()
    {
    WebElement Logo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
    System.out.println(Logo.isDisplayed());
  //  Assert.assertEquals(Logo.isDisplayed(), true);
    sassert.assertTrue(Logo.isDisplayed());
    }
}
