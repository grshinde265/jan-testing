import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class diablenotiDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream srcfile = new FileInputStream("D:\\Selenium_java_Jan22\\data.properties");
		
		Properties prop = new Properties();
		
		prop.load(srcfile);
		
		System.setProperty(prop.getProperty("driverkey"), prop.getProperty("driverpath"));
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.justdial.com/");
	}

}
