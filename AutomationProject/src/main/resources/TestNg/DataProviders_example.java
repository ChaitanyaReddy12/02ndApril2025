package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_example extends BaseOrCommon {

//	@BeforeSuite
//	public void launchBrowser() {
//
//		launchingBrowser("chrome");
//
//
//		System.out.println("in @BeforeSuite method");
//	}
//
//	@BeforeTest
//	public void launchURL() {
//
//		launchingURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//		System.out.println("in @BeforeTest method");
//	}
//
//	@BeforeClass
//	public void maximizeTheBrowser() {
//
//		maximizeBrowser();
//
//		System.out.println("in @BeforeClass method");
//
//	}
//
//	@BeforeMethod
//	public void waiting() {
//
//		waits();
//
//		System.out.println("in @BeforeMethod method");
//	}

	/*
	 * Syntax:
	 * 
	 * @dataprovider(name =’sandhya’) Public object[][] methodname(){
	 * 
	 * }
	 * 
	 * @Test(dataprovider = ‘sandhya’) Public void methodname(){
	 * 
	 * }
	 * 
	 */
	
	@DataProvider(name = "livetech")
	public Object[][] addCredentials(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "praveen";
		data[0][1] = "praveen@test.com";
		
		data[1][0] = "Shilpy";
		data[1][1] = "test@gmail.com";
		
		data[2][0] = "livetech";
		data[2][1] = "testing";
		
		return data;	
	}

	@Test(priority = 1, dataProvider = "livetech")
	public void enterCredentails(String username, String password) {
		
		launchingBrowser("chrome");

		launchingURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		maximizeBrowser();
		
		waits();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.quit();

	}

//	@AfterMethod
//	public void waiting1() {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//
//		System.out.println("in @AfterMethod method");
//
//	}
//
//	@AfterSuite
//	public void closeBrowser() {
//
//		browserClosing();
//
//		System.out.println("in @afterSuite method");
//
//	}

}
