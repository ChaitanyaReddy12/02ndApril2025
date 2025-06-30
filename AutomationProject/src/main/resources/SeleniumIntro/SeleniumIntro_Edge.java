package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntro_Edge {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver", "the path of the edge driver extension)
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
	}

}
