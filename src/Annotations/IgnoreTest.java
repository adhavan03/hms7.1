package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class IgnoreTest {
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		   }

  @Test(enabled=false)
  public void test1() {
	  driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
  }
@Test()
public void test2() {
	  driver.get("http://triotend.com/tts/site/login");
}
@Test()
public void test3() {
	  driver.get("http://triotend.com");
}


  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
