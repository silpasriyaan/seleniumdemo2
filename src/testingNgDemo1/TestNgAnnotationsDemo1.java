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

public class TestNgAnnotationsDemo1 {
  @Test
  public void funA() {
	  System.out.println("funA  of TestNgAnnotationsDemo1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod  of TestNgAnnotationsDemo1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod  of TestNgAnnotationsDemo1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass  of TestNgAnnotationsDemo1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass  of TestNgAnnotationsDemo1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest  of TestNgAnnotationsDemo1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest  of TestNgAnnotationsDemo1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite  of TestNgAnnotationsDemo1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite of TestNgAnnotationsDemo1");
  }

}
