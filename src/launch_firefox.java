import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Selenium_java_Jan22/Binary/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");

	}
}
