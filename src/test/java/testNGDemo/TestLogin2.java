
package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.xpi.XpiDriverService;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listenersDemo.MyTestNGListeners.class)
public class TestLogin2 extends Bassclass {

	@Test(priority = 0)
	public void InvalidLogin() {

		driver.get("https://www.mycontactform.com");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		WebElement username = driver.findElement(By.id("user"));

		username.sendKeys("username");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("password");

		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"right_col_top\"]/form/div/input"));
		loginButton.click();

	}

	@Test(priority =1)
	public void ValidLogin() throws InterruptedException {
		driver.get("https://www.mycontactform.com");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		WebElement username1 = driver.findElement(By.id("user"));

		username1.sendKeys("Prabhu123");

		WebElement password1 = driver.findElement(By.id("pass"));

		password1.sendKeys("12345");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"right_col_top\"]/form/div/input"));
		login.click();
		
	
		Thread.sleep(5000);
	
		WebElement form = driver.findElement(By.cssSelector("#user_bar > ul > li:nth-child(2) > a"));
		form.click();
		
	}
	public void startwizard() throws InterruptedException {
		
	
		
		Thread.sleep(2000);
		WebElement startwizard = driver.findElement(By.cssSelector("#center_col > form > div > input"));
		startwizard.click();
		
		WebElement formname = driver.findElement(By.id("formname"));
		formname.sendKeys("A13");
		
		WebElement sendtoaddress = driver.findElement(By.id("Submit"));
		sendtoaddress.click();
		
	
		Thread.sleep(5000);
	
	}
	
	public void sendtoaddress() throws InterruptedException {
		
	
		WebElement sendtoaddress1 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		sendtoaddress1.click();
		
		WebElement dropdown = driver.findElement(By.id("eadd"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("prabhutricks30@gmail.com");
		
		WebElement sendtoaddress2 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		sendtoaddress2.click();
		
		WebElement emailsubject = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		emailsubject.click();
		
	
		
		WebElement emailsubject1 = driver.findElement(By.id("subjectvalue"));
		emailsubject1.sendKeys("A");
		
		WebElement autoreponder = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		autoreponder.click();
		
		Thread.sleep(3000);
		
		WebElement autoreponder1 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		autoreponder1.click();
		
		WebElement autoreponder2 = driver.findElement(By.id("autosub"));
		autoreponder2.sendKeys("A");
		
		WebElement autoreponder3 = driver.findElement(By.id("autotext"));
		autoreponder3.sendKeys("A");
		
		WebElement autoreponder4 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		autoreponder4.click();
		
		WebElement formquestions = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formquestions.click();
		
		WebElement formquestions1 = driver.findElement(By.id("numquestions"));
		formquestions1.sendKeys("1");
		
		WebElement formquestions2 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formquestions2.click();
		
		WebElement questionlabel = driver.findElement(By.id("question[]"));
		questionlabel.sendKeys("Question");
		
		
		WebElement dropdown1 = driver.findElement(By.id("field_type[]"));
		Select drop1 = new Select(dropdown1);
		drop1.selectByIndex(1);
		
		WebElement formquestions3 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formquestions3.click();
		
		WebElement formquestions4 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formquestions4.click();
		
		WebElement questiondisplayorder = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		questiondisplayorder.click();
		
		WebElement questiondisplayorder1 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		questiondisplayorder1.click();
		
		WebElement redirectpage = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		redirectpage.click();
		
		WebElement formappearance = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formappearance.click();
		
		WebElement formappearance1 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formappearance1.click();
		
		WebElement formappearance2 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formappearance2.click();
	
		WebElement elementcustomization = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		elementcustomization.click();
		
		WebElement elementcustomization1 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		elementcustomization1.click();
		
		WebElement elementcustomization2 = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		elementcustomization2.click();
		
		WebElement linkstyle = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		linkstyle.click();
		
		WebElement errorpages = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		errorpages.click();
		
		
		WebElement formbuttons = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		formbuttons.click();
		
		WebElement sitecategory = driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
		sitecategory.click();
		
				
		
		
	}

//		driver.quit();
}
