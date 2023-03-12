package testNGDemo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bassclass {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
