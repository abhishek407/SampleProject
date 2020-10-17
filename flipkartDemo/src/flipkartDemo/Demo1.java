package flipkartDemo;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_84\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

	}

}
