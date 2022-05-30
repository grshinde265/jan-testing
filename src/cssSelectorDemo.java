import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.cssSelector("select>option:nth-of-type(11)")).click();

	}

}
