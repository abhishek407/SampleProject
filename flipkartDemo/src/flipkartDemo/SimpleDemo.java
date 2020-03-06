package flipkartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDemo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver xyz = new ChromeDriver();
		xyz.get("https://www.testandquiz.com/selenium/testing.html");
		Thread.sleep(5000);
		xyz.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	}

}
