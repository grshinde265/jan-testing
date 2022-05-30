import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class advertalert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.mycarhelpline.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		WebElement reviews = driver.findElement(By.xpath("//a[text()='Reviews']"));
		
		reviews.click();
		
		WebElement mbreview= driver.findElement(By.xpath("//img[@alt='Baleno Vs Dzire']"));
		mbreview.click();
		
		//driver.switchTo().alert().dismiss();
		/*WebElement close1= driver.findElement(By.xpath("//span[@class='ns-s7zce-e-21']"));
		close1.click();
		WebElement close2= driver.findElement(By.xpath("//span[@class='ns-fkfng-e-16']"));
		close2.click();
		WebElement close3= driver.findElement(By.xpath("//span[text()='Close']"));
		close3.click();*/
		
		if(driver.findElement(By.xpath("//div[@id='dismiss-button']")).isDisplayed()) {
			WebElement close3= driver.findElement(By.xpath("//div[@id='dismiss-button']"));
			close3.click();
			System.out.println("clicked in else if 3");
		}
		else if(driver.findElement(By.xpath("//span[@class='ns-cuw1b-e-16' and @ dir='auto']")).isDisplayed()) {
			WebElement close4 = driver.findElement(By.xpath("//span[@class='ns-cuw1b-e-16' and @ dir='auto']"));
			close4.click();
			System.out.println("clicked in else if 4");
		}
		else if(driver.findElement(By.xpath("//span[@class='ns-c0dg3-e-8' and @dir='auto']")).isDisplayed()) {
			WebElement close5 = driver.findElement(By.xpath("//span[@class='ns-c0dg3-e-8' and @dir='auto']"));
			close5.click();
			System.out.println("clicked in else if 5");
		}
	}

}
