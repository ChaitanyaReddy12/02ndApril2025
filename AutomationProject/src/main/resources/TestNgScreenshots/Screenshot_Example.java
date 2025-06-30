package TestNgScreenshots;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNg.BaseOrCommon;

public class Screenshot_Example extends BaseOrCommon {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		launchingBrowser("chrome");

		System.out.println("in @BeforeSuite method");
		
		screenshot("Screenshot_Example_launchBrowser");
	}

	@BeforeTest
	public void launchURL() throws IOException {

		launchingURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("in @BeforeTest method");
		
		screenshot("Screenshot_Example_launchURL");
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

		String expectedTitle = "OrangeHRM";
		
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle);

		System.out.println("in verifyTitle method");
		
		System.out.println("Hi team");
		
		System.out.println("good evening");

	}

	@Test(priority = 1)
	public void enterUserName() throws IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		System.out.println("in enterUserName method");
		
		screenshot("Screenshot_Example_enterUserName");


	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		System.out.println("in enterPassword method");

		screenshot("Screenshot_Example_enterPassword");

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
	public void closeBrowser() throws IOException {
		
		screenshot("Screenshot_Example_closeBrowser");

		browserClosing();

		System.out.println("in @afterSuite method");

	}

}
