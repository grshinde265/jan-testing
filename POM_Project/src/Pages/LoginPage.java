package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	// Object Repository
	
	By userName = By.xpath("//input[@id='userid']");
	By password = By.xpath("//input[@id='password']");
	By LoginBtn = By.xpath("//button[@class='button-orange wide']");
	By ForgotPasswordLink = By.xpath("//a[contains(text(),'Forgot')]");
	By LoginPin = By.xpath("//input[@id='pin']");
	By ContinueBtn = By.xpath("//button[contains(text(),'Continue')]");
	
	
	public void clickLogin(String uname, String pword) {
		
		driver.findElement(userName).sendKeys(uname);
		driver.findElement(password).sendKeys(pword);
		driver.findElement(LoginBtn).click();
	}
	public void ClickForgotP() {
		driver.findElement(ForgotPasswordLink).click();
	}
	public void clickPin(String pin) {
		driver.findElement(LoginPin).sendKeys(pin);
		driver.findElement(ContinueBtn).click();
	}
}
