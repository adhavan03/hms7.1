package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BAsuite {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://triotend.com");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
			driver=new ChromeDriver();
	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
