package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class skip {
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		   }
  @Test
  public void skip() {
	 
	  String a ="Skip Test";
		if(a.equals("Skip Test")){
			throw new SkipException("Skipping - This is not ready for testing ");
		}else{
			 driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		System.out.println("I am in else condition");	
		}
		System.out.println("I am out of the if else condition");
		
  }
 @Test
 public void nonskip() {
	 driver.get("http://triotend.com");
	 System.out.println("No need to skip this test");
 }
 @AfterTest
 public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
}
}
