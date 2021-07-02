package Annotations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BAmethod {
	WebDriver driver;
	 Alert alrt;
@BeforeMethod
public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
	Thread.sleep(5000);
}
	
  @Test
  public void test1() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id='content']/button")).click();
      Thread.sleep(3000);
      alrt=driver.switchTo().alert();
      System.out.println(alrt.getText());
     alrt.accept();
     	  
  }
@Test
public void test2() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='content']/button")).click();
    Thread.sleep(3000);
    alrt=driver.switchTo().alert();
    alrt.accept();
}
@Test
public void test3() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='content']/button")).click();
    Thread.sleep(3000);
    alrt=driver.switchTo().alert();
    alrt.dismiss();
}
     
 
  
@AfterMethod
public void teardown() {
	driver.close();
	
}
  
}
