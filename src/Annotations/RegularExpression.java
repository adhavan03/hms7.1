package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegularExpression {
	WebDriver driver;
	 @Test(groups = { "include-test-one" })
	  public void test1() {
		  System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://triotend.com/tts/site/login");
	  }
	  @Test(groups = { "include-test-two" })
	  public void test2() {
		  driver.get("http://triotend.com");		
	  }
	  @Test(groups = { "test-one-exclude" })
	  public void test3() {
		  System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
	  }
	  @Test(groups = { "test-two-exclude" })
	  public void test4() {
		  driver.get("http://erp.triotend.com/");
		 
	  }
}
