package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertstring {
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.get("http://triotend.com/tts/site/login");
		  WebElement logo=driver.findElement(By.xpath("//i[@class='fa fa-key']"));
		String act="Smart Hospital : Hospital Management System";
		String expt=driver.getTitle();
		Assert.assertEquals(act, expt);
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test");
  }
}
