package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority {
  @Test(priority=2)
  public void test1() {
		 System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			  driver.get("http://triotend.com");
			  driver.close();  
			   }
 @Test(priority=1)
 public void test2() {
	 System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		  driver.close();
 }

}

