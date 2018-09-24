package aricent.com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class App
{
 @Test
 public static void main(String[] args) {


 System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
 ChromeOptions chromeOptions = new ChromeOptions();
 WebDriver driver = new ChromeDriver(chromeOptions);


 driver.get("http://localhost:3001");

 driver.manage().timeouts().implicitlyWait(3,
TimeUnit.SECONDS);
 driver.findElement(By.name("login")).sendKeys("edureka");
 driver.findElement(By.name("password")).sendKeys("edureka");
 driver.findElement(By.name("click")).click();
 //Thread.sleep(5000);
 driver.quit();
 }

}
