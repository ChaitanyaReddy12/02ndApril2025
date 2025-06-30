package TestNgAssertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNg.BaseOrCommon;

public class SoftAssertion_Example2 extends BaseOrCommon {

	@BeforeSuite
	public void launchBrowser() {

		launchingBrowser("chrome");

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
	public void verifyTitle() {
		
		SoftAssert sa = new SoftAssert();

		String expectedTitle = "praveen";
		
		String actualTitle = driver.getTitle();
		
		sa.assertEquals(expectedTitle, actualTitle);

		System.out.println("in verifyTitle method");
		
		System.out.println("Hi team");
		
		System.out.println("good evening");
		
		sa.assertAll();

	}

	@Test(priority = 1)
	public void enterUserName() {
		
		boolean status = driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
		
		assertEquals(status, true);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		System.out.println("in enterUserName method");
	}

	@Test(priority = 2)
	public void enterPassword() {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		System.out.println("in enterPassword method");

	}

	@Test(priority = 3)
	public void clickLogin() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

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
