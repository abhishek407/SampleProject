package flipkartDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNgDemo {
  @Test(groups = {"bond"})
  public void f() {
  }
  
  @Test(groups = { "bonding" })
  public void f1()
  {
	  System.out.println("Lakshmi");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
