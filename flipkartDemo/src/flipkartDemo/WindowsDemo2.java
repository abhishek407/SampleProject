package flipkartDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		//Launching the site.
	    driver.get("http://demo.guru99.com/popup.php");	
		    
		driver.manage().window().maximize();		
		        		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();	
		
		String window = driver.getWindowHandle();
		System.out.println(window);

		Set<String> windows = driver.getWindowHandles();
		System.out.println("before removing");
		System.out.println(windows);
		
		windows.remove(window);
		
		System.out.println("After Removing");
		System.out.println(windows);
		
		for (String abc : windows) 
		{
			driver.switchTo().window(abc);
			//Thread.sleep(5000);
			driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
			//Thread.sleep(5000);
			driver.findElement(By.name("btnLogin")).click();
			
			
		}
		

	}

}
