package flipkartDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgClass {
	
	@Test
	public void firstBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void secondBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	

	
	
	
	
	
	
	
}
