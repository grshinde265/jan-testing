package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationSeq {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("FIRST");
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void s() {
	  System.out.println("SECOND");
	  driver.get("https://www.google.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");
	  System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BEFORE TEST");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AFTER TEST");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BEFORE SUITE");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AFTER SUITE");
  }

}
