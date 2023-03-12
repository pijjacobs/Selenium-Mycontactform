package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
			 WebElement searchBox = driver.findElement(By.name("q"));
			 searchBox.sendKeys(Keys.chord(Keys.SHIFT,"jegan"));
			 searchBox.clear();
			 
			 WebElement searchButton = driver.findElement(By.name("btnK"));
			 System.out.println("Name of the button is: "
			 +searchButton.getAttribute("name"));
			 System.out.println("Id of the button is: " 
			+searchButton.getAttribute("id"));
			 System.out.println("Class of the button is: "
			 +searchButton.getAttribute("class"));
			 System.out.println("Label of the button is: "
			 +searchButton.getAttribute("aria- label"));
			 }
			

	}


