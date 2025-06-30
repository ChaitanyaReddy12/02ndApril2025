package Tests;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.LoginPage;

public class ListenersExample extends BaseOrCommon{
	
	LoginPage lp;
	
	//Srilakshmi sl;

	@BeforeSuite
	public void launchBrowser() {

		launchingBrowser("chrome");
		
		lp = new LoginPage(driver);
		
		//sl = new Srilakshmi();

		System.out.println("in @BeforeSuite method");
	}

	@BeforeTest
	public void launchURL() {
		
		//sl.beforeNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

		launchingURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//sl.afterNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

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
	
	@Test(priority = 0)
	public void verifyApplicationLogo() {

		lp.verifyLogo();

		System.out.println("in verifyApplicationLogo method");
	}
	
	@Test(priority = 1)
	public void verifyForgotYourPasswordLink() {

		lp.verifyForgotYourPassword();

		System.out.println("in verifyForgotYourPasswordLink method");
	}


	@Test(priority = 2)
	public void enterUserName() {

		lp.enterUsername();

		System.out.println("in enterUserName method");

	}

	@Test(priority = 3)
	public void enterPassword() {

		lp.enterPassword();

		System.out.println("in enterPassword method");

	}

	@Test(priority = 4)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("in clickLogin method");

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
