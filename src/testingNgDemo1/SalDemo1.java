package testingNgDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SalDemo1 {
	//private static final boolean Assert1 =true;
	@Test
	public void funA()
	{
		System.out.println("funA of SalDemo1");
		String silpa="Shanthi";
		String sivansh="Shruthi";
		Assert.assertEquals(silpa, sivansh);
		System.out.println("Done");
	}
	@Test
	public void funB()
	{
		System.out.println("funB of SalDemo1");
		String silpa="Shanthi";
		String sivansh="Shanthi";
		Assert.assertEquals(silpa, sivansh);
		System.out.println("Done");
	}
}
