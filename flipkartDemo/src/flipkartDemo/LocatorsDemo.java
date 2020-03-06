package flipkartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.testandquiz.com/selenium/testing.html");

		/*
		 * ///using id driver.findElement(By.id("fname")).sendKeys("Lakshmi");
		 */

		/*
		 * //Using Name driver.findElement(By.name("firstName")).sendKeys("Abhishek");
		 */
		// using className
		/*
		 * Thread.sleep(3000); driver.findElement(By.className("Performance")).click();
		 */

		// Using linkText
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.linkText("This is a link")).click();
		 */

		/*
		 * Thread.sleep(3000); // driver.navigate().back(); //using partialLinkText
		 * driver.findElement(By.partialLinkText("This")).click();
		 * //driver.navigate().back(); //using tagName
		 */

		// driver.findElement(By.tagName("a")).click();

		// driver.navigate().back();

		/*
		 * Select abc = new Select(driver.findElement(By.id("testingDropdown")));
		 * 
		 * //Select abc = new Select(element)
		 * 
		 * 
		 * se.selectByIndex(0); se.selectByValue("Database");
		 * se.selectByVisibleText("Manual Testing");
		 * 
		 * 
		 * // abc.selectByIndex(2); Thread.sleep(3000);
		 * abc.selectByVisibleText("Database Testing");
		 */

		
		  //using xpath [with AND] driver.findElement(By.
		//driver.findElement(By.xpath("//input[@type='checkbox' and @class='Performance']")).click(); //using
		  //xpath [with contains] //-->//*[contains(text(),'Sub')]
		/*
		 * driver.findElement(By.xpath("//input[contains(@value,'formance')]")).click();
		 * //using xpath [with starts-with]
		 * driver.findElement(By.xpath("//input[starts-with(@value,'Perform')]")).click(
		 * ); //using xpath [with text()]
		 */		  
		  driver.findElement(By.xpath("//*[contains(text(),'link')]")).click();
		  
		 /* // using cssSelector [with id]
		  driver.findElement(By.cssSelector("input#fname")).sendKeys("Abhi");
		  
		  // using cssSelector [with class]
		  driver.findElement(By.cssSelector("input.Automation")).click();
		  
		  // using cssSelector [with attribute]
		  driver.findElement(By.cssSelector("input[id=fname]")).sendKeys("Abhi");
		  
		  // using cssSelector [with class and attribute]
		  driver.findElement(By.cssSelector("input.Performance[type=checkbox]")).click(
		  );*/
		  
		  
		  
		 

	}

}
