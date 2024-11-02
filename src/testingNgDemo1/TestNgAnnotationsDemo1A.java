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

public class TestNgAnnotationsDemo1A {
  @Test
  public void funA() {
	  System.out.println("funA  of TestNgAnnotationsDemo1A");
  }
  @Test
  public void funB() {
	  System.out.println("funB  of TestNgAnnotationsDemo1A");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod  of TestNgAnnotationsDemo1A");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod  of TestNgAnnotationsDemo1A");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass  of TestNgAnnotationsDemo1A");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass  of TestNgAnnotationsDemo1A");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest  of TestNgAnnotationsDemo1A");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest  of TestNgAnnotationsDemo1A");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite  of TestNgAnnotationsDemo1A");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite of TestNgAnnotationsDemo1A");
  }

}
