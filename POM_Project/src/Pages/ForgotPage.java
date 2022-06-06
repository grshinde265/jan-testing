package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPage {

	WebDriver driver;
	
	public ForgotPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userID = By.xpath("//label[text()='User ID']//following-sibling::input");
	By Pan = By.xpath("//label[text()='PAN']//following-sibling::input");
	
	public void forgotDetails() {
		driver.findElement(userID).sendKeys("XA0634");
		driver.findElement(Pan).sendKeys("airpn1678g");
	}
}
