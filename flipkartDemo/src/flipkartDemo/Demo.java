package flipkartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
	
		ChromeDriver abc = new ChromeDriver();
		
		 abc.get("https://www.facebook.com/"); 
		 
		/*
		 * abc.findElement(By.name("email")).sendKeys("abhishek123");
		 * Thread.sleep(5000); abc.findElement(By.id("pass")).sendKeys("abhishek");
		 * Thread.sleep(5000);
		 * abc.findElement(By.xpath("//input[@value='Log In']")).click();
		 */
		 
		 Thread.sleep(5000);
		 abc.findElement(By.partialLinkText("Face")).click();
		 
		/*
		 * Thread.sleep(7000); driver.quit();
		 * 
		 */
		
		
		//chrome.navigate().to("https://www.facebook.com/");
		/*
		 * Thread.sleep(5000); chrome.navigate().back(); Thread.sleep(5000);
		 * chrome.navigate().forward();
		 */
		/*
		 * chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * chrome.findElement(By.id("email")).sendKeys("abhishek");
		 * chrome.findElement(By.name("passwd")).sendKeys("abhi");
		 */
		

		
	}

}
