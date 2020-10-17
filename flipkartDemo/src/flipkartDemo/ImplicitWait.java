package flipkartDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    // Implicit Wait for 20 seconds
	driver.get("https://login.yahoo.com/");
	driver.findElement(By.id("login-username")).sendKeys("hello"); 
	Thread.sleep(1000);
	driver.findElement(By.id("login-signin")).click(); 
	
	}
}