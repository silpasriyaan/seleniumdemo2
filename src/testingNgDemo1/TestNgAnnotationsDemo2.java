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

public class TestNgAnnotationsDemo2 {
	@Test
	public void funA() {
		System.out.println("funA  of TestNgAnnotationsDemo2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod  of TestNgAnnotationsDemo2");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass  of TestNgAnnotationsDemo2");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest  of TestNgAnnotationsDemo2");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite of TestNgAnnotationsDemo2");
	}

}
