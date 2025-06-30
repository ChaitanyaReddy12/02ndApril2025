package Tests;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginAndLogoutTest extends BaseOrCommon {
	
	LoginPage lp;
	
	HomePage hp;

	@BeforeSuite
	public void launchBrowser() {

		launchingBrowser("chrome");
		
		lp = new LoginPage(driver);
		
		//Syntax: Classname objectname = pagefactory.initElements(web driver object, pagefactoryclass.class)

		hp = PageFactory.initElements(driver, HomePage.class)
				;
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
	
	@Test(priority = 5)
	public void clickAdminTab() {

		hp.clickAdmin();

		System.out.println("in clickAdminTab method");

	}
	

	@Test(priority = 5)
	public void clickUser() {

		hp.clickUserOption();

		System.out.println("in clickUser method");

	}
	
	@Test(priority = 6)
	public void clickLogoutTab() {

		hp.clickLogout();

		System.out.println("in clickLogoutTab method");

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
