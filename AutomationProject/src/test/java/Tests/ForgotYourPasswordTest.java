package Tests;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class ForgotYourPasswordTest extends Common.BaseOrCommon {

	LoginPage lp;

	ForgotYourPasswordMethods fpm;

	@BeforeSuite
	public void launchBrowser() {

		launchingBrowser("chrome");

		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);

		System.out.println("in @BeforeSuite method");
	}

	@BeforeTest
	public void launchURL() {

		launchingURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("in @BeforeTest method");
	}

	@BeforeClass
	public void maximizeTheBrowser() {

		maximizeBrowser();

		System.out.println("in @BeforeClass method");

	}

	@BeforeMethod
	public void waiting() {

		waits();

		System.out.println("in @BeforeMethod method");
	}

	@Test(priority = 1)
	public void clickForgotYourPasswordLink() throws IOException {
		
		screenshot("beforeclickingonForgotYourPasswordLink");

		lp.clickForgotYourPasswordLink();

		System.out.println("in clickForgotYourPasswordLink method");
	}

	@Test(priority = 2)
	public void enterUserName() throws IOException {

		fpm.enterUsername();
		
		screenshot("afterenteredtheusername");

		System.out.println("in enterUserName method");

	}

	@Test(priority = 3)
	public void clickCancelButton() throws IOException {

		fpm.clickCancel();

		screenshot("afterclickingoncancelbutton");

		System.out.println("in clickCancelButton method");

	}

	@AfterMethod
	public void waiting1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();

		System.out.println("in @afterSuite method");

	}

}
