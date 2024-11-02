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

public class TestNgAnnotationsDemo3 {
	@Test
	public void funA() {
		System.out.println("funA  of TestNgAnnotationsDemo3");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod  of TestNgAnnotationsDemo3");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass  of TestNgAnnotationsDemo3");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest  of TestNgAnnotationsDemo3");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite of TestNgAnnotationsDemo3");
	}

}
