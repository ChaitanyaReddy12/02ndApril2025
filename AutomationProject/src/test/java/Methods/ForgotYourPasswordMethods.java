package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotYourPasswordPage;

public class ForgotYourPasswordMethods {

	public WebDriver driver;

	public ForgotYourPasswordMethods(WebDriver driver) {

		this.driver = driver;
	}
	
	ForgotYourPasswordPage fp = new ForgotYourPasswordPage(driver);
	
	public void clickCancel() {

		driver.findElement(fp.cancelButton).click();
	}	

	public void clickResetPassword() {

		driver.findElement(fp.resetPasswordButton).click();
	}
	
	public void enterUsername() {

		driver.findElement(fp.usernameTextbox).sendKeys("Sandhya");
	}
	
}
