package testingNgDemo1;

import org.testng.annotations.Test;

public class TestNgDemo5 {
@Test(priority=1)
public void loginTest()
{
	System.out.println("login test of TestNgDemo5");
	System.out.println(0/0);
}
@Test(priority=2)
public void customerDetails()
{
	System.out.println("Customer Detsils of TestNgDemo5");
}
}
