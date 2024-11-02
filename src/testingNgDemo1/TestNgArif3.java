package testingNgDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgArif3 {
	@Test
	public void funA()
	{
		System.out.println("funA of SalDemo1");
		String silpa="Shanthi";
		String sivansh="Shruthi";
		//Assert.assertEquals(silpa, sivansh);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(silpa, sivansh);
		System.out.println("Done");
	}
	@Test
	public void funB()
	{
		System.out.println("funB of SalDemo1");
		String silpa="Shanthi";
		String sivansh="Shanthi";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(silpa, sivansh);
		//Assert.assertEquals(silpa, sivansh);
		System.out.println("Done");
	}
}


