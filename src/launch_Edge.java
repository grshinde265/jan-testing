import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class launch_Edge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://www.facebook.com");

	}
}
