package flipkartDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesDemo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");//http://demo.automationtesting.in/Frames.html 

		driver.manage().window().maximize();
		
		///driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("/html/body/a/img")).click();
		
		driver.switchTo().defaultContent();
	
		
		/*
		 * System.out.println(size); driver.switchTo().frame("a077aa5e"); //switching
		 * the frame by ID
		 * 
		 * System.out.println("********We are switch to the iframe*******");
		 * driver.findElement(By.xpath("html/body/a/img")).click();
		 */

	}

}
