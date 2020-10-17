import java.io.File;
import java.io.FileWriter;

public class SimpleDemo {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selenium\\chromedriver_win32_84\\chromedriver.exe"); ChromeDriver driver
		 * = new ChromeDriver();
		 * driver.get("https://www.testandquiz.com/selenium/testing.html");
		 * 
		 * driver.findElement(By.id("fname")).sendKeys("Vidya");
		 * 
		 * 
		 * 
		 * String a = "$55.99"; System.out.println(a.substring(1));
		 */
		
		System.out.println("Starting....");
        File file = new File("/home/Desktop/test/output.csv");
        try {
            FileWriter output = new FileWriter(file);
            CSVWriter write = new CSVWriter(output);

            // Header column value
            String[] header = { "ID", "Name", "Address", "Phone Number" };
            write.writeNext(header);
            // Value
            String[] data1 = { "1", "First Name", "Address1", "12345" };
            write.writeNext(data1);
            String[] data2 = { "2", "Second Name", "Address2", "123456" };
            write.writeNext(data2);
            String[] data3 = { "3", "Third Name", "Address3", "1234567" };
            write.writeNext(data3);
            write
            write.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        System.out.println("End.");


	}

}
