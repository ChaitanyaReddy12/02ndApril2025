package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	/*
	 * Syntax: 1st way:
	 * 
	 * @FindBy(how = How.XPATH, using ="//*[@class='oxd-userdropdown-name']") public
	 * WebElement user_Dropdown;
	 * 
	 * 2nd way:
	 * 
	 * @FindBy(xpath = "//*[text()='Logout']") public WebElement logout_Tab;
	 * 
	 */

	// 1st way

	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminTab;

	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pimTab;

	@FindBy(className = "oxd-userdropdown-name")
	public WebElement userOption;

	// 2nd way

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public WebElement logoutTab;

	@FindBy(how = How.XPATH, using = "//a[text()='Support']")
	public WebElement supportTab;

	public void clickAdmin() {

		adminTab.click();
	}

	public void clickPim() {

		pimTab.click();
	}

	public void clickUserOption() {

		userOption.click();
	}
	
	public void clickLogout() {

		logoutTab.click();
	}
	
	public void clickSupport() {

		supportTab.click();
	}

}
