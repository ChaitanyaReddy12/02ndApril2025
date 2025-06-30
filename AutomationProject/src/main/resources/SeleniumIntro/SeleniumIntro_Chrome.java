package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro_Chrome {	
	

	public static void main(String[] args) {

		/*Syntax:

Interface objectname = new classname();

Ex: Webdriver tuesday = new chromedriver();
*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
	}

}
