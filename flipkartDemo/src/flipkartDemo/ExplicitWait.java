package flipkartDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement firstname= driver.findElement(By.name("firstname"));
		WebElement lastname= driver.findElement(By.name("lastname"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(firstname));
		
		firstname.click();
		
		WebElement forgotAccount= driver.findElement(By.linkText("Forgotten account?"));
		
		wait.until(ExpectedConditions.elementToBeClickable(forgotAccount));
		
		forgotAccount.click();
		
		Wait wait2 = new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(10,TimeUnit.SECONDS) ;
		
		
		
		}
		
		
		}



