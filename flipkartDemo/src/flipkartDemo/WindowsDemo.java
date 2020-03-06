package flipkartDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo 
{

	public static void main(String[] args) throws InterruptedException {	
	 				
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	
	//Launching the site.
    driver.get("http://demo.guru99.com/popup.php");	
	    
	driver.manage().window().maximize();		
	        		
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Click Here']")).click();			

	String current=driver.getWindowHandle();
	System.out.println(current);
	
	Set<String> xyz=  driver.getWindowHandles();
	
	System.out.println(xyz);
	
	xyz.remove(current); //-- remove the first tab
	for (String abc : xyz)
	{
				driver.switchTo().window(abc);
				Thread.sleep(5000);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				Thread.sleep(5000);
				driver.findElement(By.name("btnLogin")).click();
	}
	driver.switchTo().window(current);
	
	
		/*
		 * for (String string : xyz) { if(!current.equalsIgnoreCase(string)) {
		 * driver.switchTo().window(string);
		 * driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
		 * 
		 * driver.findElement(By.name("btnLogin")).click(); break; } }
		 * 
		 * driver.switchTo().window(current); }
		 */
	}
}
