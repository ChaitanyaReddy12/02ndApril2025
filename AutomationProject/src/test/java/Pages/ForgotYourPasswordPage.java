package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotYourPasswordPage {

	public WebDriver driver;

	public ForgotYourPasswordPage(WebDriver driver) {

		this.driver = driver;
	}

	// Syntax: accessmodifier By webelementname = By.locator(“”);

	// 2nd way

	public By usernameTextbox = By.xpath("//input[@name='username']");

	public By resetPasswordButton = By.xpath("//button[@type='submit']");
	
	public By cancelButton = By.xpath("//button[@type='button']");
	
}
