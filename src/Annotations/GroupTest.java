package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest {
	WebDriver driver;
  @Test(groups = {"erp"})
  public void test1() {
	  System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://triotend.com/tts/site/login");
  }
  @Test(groups = {"erp"})
  public void test2() {
	  driver.get("http://triotend.com");		
  }
  @Test(groups = {"ecom"})
  public void test3() {
	  System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
  }
  @Test(groups = {"ecom"})
  public void test4() {
	  driver.get("http://erp.triotend.com/");
	  driver.close();
  }
}
