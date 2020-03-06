package flipkartDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_79\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");//http://demo.automationtesting.in/Frames.html 

		String abc = driver.getCurrentUrl();
		
		if(abc.equals("https://www.google.com/"))
		{
			System.out.println("correct link");
		}
		else
		{
			System.out.println("wrong link opened");
		}
		
		
	}

}
