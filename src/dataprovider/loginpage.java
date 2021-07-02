package dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.Loginutility;

public class loginpage {
WebDriver driver;

@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
	 driver=new ChromeDriver();
}
@DataProvider
public Iterator<Object[]>getdata()
{
	ArrayList<Object[]> data=Loginutility.getdata();
	return data.iterator();
}

@Test(dataProvider="getdata")
public void test(String username,String password) {
	driver.get("http://triotend.com/tts/site/login");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	  driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/img[1]")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@AfterClass
public void teardown()
{
	driver.close();
}



}
