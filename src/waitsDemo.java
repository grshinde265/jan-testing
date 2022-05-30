import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		
		

		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		WebElement VisibleAfterBtn = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		
		System.out.println(VisibleAfterBtn.isEnabled());
		
	}

}
