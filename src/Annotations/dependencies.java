package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dependencies {
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://triotend.com/tts/site/login");
		 
	  }
  @Test(groups = {"login"})
  public void test1() {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("triotend2");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
  }
 @Test(groups = {"addvisitor"})
 public void test2() throws InterruptedException {
		WebElement frontoffice=driver.findElement(By.cssSelector("ul.sidebar-menu>li"));
		Thread.sleep(3000);
		frontoffice.click();
	
		WebElement visitorbook=driver.findElement(By.cssSelector("div.box-tools>a:nth-of-type(2)"));
		Thread.sleep(3000);
		visitorbook.click();
 			
		WebElement addvistior=driver.findElement(By.cssSelector("div.box-tools>a"));
		Thread.sleep(3000);
		addvistior.click();
 }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
