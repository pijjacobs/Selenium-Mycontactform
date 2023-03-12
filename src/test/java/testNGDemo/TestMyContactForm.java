package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestMyContactForm {
  @Test(dataProvider = "dp", priority = 0)
  public void testcasevalid (Integer n, String s) {
	  
	  System.out.println("Test is successfull");
  }
  @Test(priority = 1, timeOut =3000, description="I want to test with invalid details", invocationCount = 10)
 public void testcaseInvalid () throws InterruptedException {
	  
	  System.out.println("Negative Scenario");
	  
	  Thread.sleep(4000);
 }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Launch URL and valid login");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Logout");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
      new Object[] { 5, "e" },
      new Object[] { 6, "f" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Setting Database connector for geting test data");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Close connection and generate reports");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Open the Browser");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Close the browser");
  }

}
