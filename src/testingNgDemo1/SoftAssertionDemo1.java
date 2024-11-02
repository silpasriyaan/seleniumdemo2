package testingNgDemo1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo1 {
	@Test
public void funA()
{
	System.out.println("soft funA start");
	SoftAssert sAssrt=new SoftAssert();
	String expectedData1="RBG technologies";
	String actualData1="RBG technologies";
	sAssrt.assertEquals(actualData1, expectedData1);
	System.out.println("Test1 completed");
	
	String actualData2="Selenium";
	sAssrt.assertEquals(actualData2, expectedData1);
	System.out.println("Test2 completed");
	
}
}
