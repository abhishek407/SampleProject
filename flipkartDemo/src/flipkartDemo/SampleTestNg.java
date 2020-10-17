package flipkartDemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestNg 

{

	@Test()
	public void test1()
	{
		System.out.println("SampleTestNg.Test1");
	}
	
	@Test
	public void test2() throws Exception
	{
		System.out.println("SampleTestNg.Test2");
	}
	
	
}
