package TestNG_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class AssertDemo {
	public WebDriver driver;
	@Test(enabled = false)
	public void CheckTitleTest()
	{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java_Jan22\\Binary\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://demoqa.com");
    
    String ExpectedTitle = "Free QA Automation Tool for Every one";
    String ActualTitle = driver.getTitle();
    Assert.assertEquals(ActualTitle, ExpectedTitle,"Titles of the website do not match");
    System.out.println("This is the default Assert provided by TestNg");
    Reporter.log("Default Assert behavior is like if test fails then terminate the method and navigate to other method",true);
	}
    @Test
    public void LogoTest()
    {
    WebElement Logo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
    System.out.println(Logo.isDisplayed());
  //  Assert.assertEquals(Logo.isDisplayed(), true);
    Assert.assertTrue(Logo.isDisplayed());
    }
    
    private int i = 1;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
	@Test
	public void HandleDropDown() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement newAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		newAcc.click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select Day = new Select(day);

	//	Day.selectByVisibleText("13");
	//	Day.selectByIndex(10);
		Day.selectByValue("10");
	}
}