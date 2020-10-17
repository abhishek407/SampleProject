package flipkartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
	
		ChromeDriver abc = new ChromeDriver();
		
		 abc.get("https://www.facebook.com/"); 
		 
		 
		 Thread.sleep(5000);
		 String xys = abc.findElement(By.xpath("//table/tbody/tr[12]/td[1]")).getText();
		 System.out.println(xys);
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
