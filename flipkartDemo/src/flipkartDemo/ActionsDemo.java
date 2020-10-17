package flipkartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {


	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		String baseUrl = "https://www.facebook.com/"; 
		ChromeDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		
		WebElement rf = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(rf).click().perform();

		/*
		 * Actions builder = new Actions(driver);
		 * 
		 * 
		 * Action seriesOfActions = builder .moveToElement(txtUsername) .click()
		 * .keyDown(txtUsername, Keys.SHIFT) .sendKeys(txtUsername, "hello")
		 * .keyUp(txtUsername, Keys.SHIFT) .doubleClick(txtUsername) .contextClick()
		 * .build();
		 * 
		 * seriesOfActions.perform() ;
		 */

	}

}
