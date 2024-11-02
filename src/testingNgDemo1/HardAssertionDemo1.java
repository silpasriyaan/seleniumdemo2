package testingNgDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HardAssertionDemo1 {
	@Test
	public void funA()
	{
		System.out.println("funA of HardASsertion");
		String expectedData="RBG Technologies";
		String actualData="RBG Technologies";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("funA Done");
	}

	@Test
	public void funB()
	{
		System.out.println("funB of HardASsertion");
		String expectedData="RBG Technologies";
		String actualData="Selenium";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("funB Done");
	}

	@Test
	public void funC()
	{
		System.out.println("funC of HardASsertion");
		String expectedData="RBG Technologies";
		String actualData="Selenium";
		Assert.assertNotEquals(actualData, expectedData);
		System.out.println("funB Done");
	}
	@Test
	public void funD()
	{
		System.out.println("funD of HardASsertion");
		String expectedData="RBG Technologies";
		String actualData="RBG Technologies";
		Assert.assertNotEquals(actualData, expectedData);
		System.out.println("funD Done");
	}
	@Test
	public void funE()
	{
		System.out.println("funE of HardASsertion");
		
Assert.assertTrue(true);
		System.out.println("funE Done");
	}
	@Test
	public void funF()
	{
		System.out.println("funF of HardASsertion");
		
Assert.assertFalse(false);
		System.out.println("funF Done");
	}
	
	@Test
	public void funG()  //kaaavalasindhi false ye
	{
		System.out.println("funG of HardASsertion");
		
Assert.assertFalse(false);
		System.out.println("funG Done");
	}

	@Test
	public void funH()  //kaaavalasindhi false ye
	{
		System.out.println("funH of HardASsertion");
		
Assert.assertFalse(true);
		System.out.println("funH Done");
	}



}
