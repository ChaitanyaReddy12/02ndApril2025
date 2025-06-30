package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Syntax: accessmodifier By webelementname = By.locator(“”);

	// 1st way

	private By applictaionLogo = By.xpath("//*[@alt='company-branding']");

	private By usernameTextbox = By.xpath("//input[@name='username']");

	private By passwordTextbox = By.xpath("//input[@name='password']");

	private By loginButton = By.xpath("//button[@type='submit']");

	private By forgotYourPasswordLink = By.xpath("//*[text()='Forgot your password? ']");

	public void verifyLogo() {

		driver.findElement(applictaionLogo).isDisplayed();
	}

	public void clickForgotYourPasswordLink() {

		driver.findElement(forgotYourPasswordLink).click();
	}
	
	public void verifyForgotYourPassword() {

		driver.findElement(forgotYourPasswordLink).isDisplayed();
	}

	public void clickLogin() {

		driver.findElement(loginButton).click();
	}
	
	public void enterUsername() {

		driver.findElement(usernameTextbox).sendKeys("Admin");
	}
	
	public void enterPassword() {

		driver.findElement(passwordTextbox).sendKeys("admin123");
	}

}
