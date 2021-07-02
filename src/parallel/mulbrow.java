package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mulbrow {
  @Test
  public void test1() {
  System.setProperty("webdriver.gecko.driver", "./src/drivers/geckodriver.exe");
	  System.out.println("Get Firefox : " + Thread.currentThread().getId());
		WebDriver driver=new FirefoxDriver();
		  driver.get("http://erp.triotend.com/");
		  driver.close();  
  }
  
  @Test
  public void test2() {
System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
System.out.println("Get Chrome : " + Thread.currentThread().getId());
	 WebDriver driver=new ChromeDriver();
	  driver.get("http://triotend.com/tts/site/login");
	  driver.close();
  }
}
