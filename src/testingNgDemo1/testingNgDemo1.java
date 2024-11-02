package testingNgDemo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testingNgDemo1 {
  @Test
  public void funA() {
	  System.out.println("funA of testingNgDemo1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod  of testingNgDemo1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod  of testingNgDemo1");
  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass of testingNgDemo1");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass  of testingNgDemo1");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest of testingNgDemo1");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterSuite  of testingNgDemo1");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite  of testingNgDemo1");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite  of testingNgDemo1");

  }

}
