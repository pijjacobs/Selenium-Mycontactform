package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromBrowserTesting {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\james\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mycontactform.com");

	}

}
