package flipkartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/guru99home/");//http://demo.automationtesting.in/Frames.html 

			driver.manage().window().maximize();
			WebDriverWait driverWait = new WebDriverWait(driver,20);
			
			driverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("html/body/a/img"))));
			
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
			driver.findElement(By.xpath("html/body/a/img")).click();
     
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[text()='Demo Site']")).click();
			System.out.println("*********We are done***************");
    }

	}

