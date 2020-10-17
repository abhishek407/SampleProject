package flipkartDemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/web-table-element.php";
		
		//String url = "http://toolsqa.com/automation-practice-table";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		  
		 driver.get(url);
		 
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		
		WebElement a= driver.findElement(By.id("ahsdh"));
		
		a.click();
		
		for (int i = 1; i <= rows.size(); i++) 
		{
			String a = "//table/tbody/tr[";
			String b = "]/td";
			List<WebElement> columns = driver.findElements(By.xpath(a+i+b));
			
			  for (int j = 0; j < columns.size(); j++) 
			  {
			  System.out.print(columns.get(j).getText()); 
			  }
			System.out.println();
			
		}
		
		 
		 /*
		 * String text =
		 * driver.findElement(By.xpath("//table/tbody/tr[10]/td[1]")).getText();
		 * 
		 * System.out.println(text);
		 */
		 
		/*
		 * List<WebElement> rows_list =
		 * driver.findElements(By.xpath("//table/tbody/tr")); for (WebElement rows :
		 * rows_list) {
		 * 
		 * List<WebElement> columns_list = rows.findElements(By.tagName("td")); for
		 * (WebElement columns : columns_list) { System.out.print(columns.getText());
		 * System.out.print("||"); } System.out.println(); }
		 */
		 
		/*
		 * List<WebElement> rows_list
		 * =driver.findElements(By.xpath("//table/tbody/tr"));
		 * 
		 * for (int i = 1; i <= rows_list.size(); i++) { List<WebElement> columns_list =
		 * driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
		 * 
		 * for (int j = 0; j < columns_list.size(); j++) { String val_col =
		 * columns_list.get(j).getText(); System.out.print(val_col); }
		 * System.out.println(); }
		 */
		 
	}

}
