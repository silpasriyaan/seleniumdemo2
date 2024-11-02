package testingNgDemo1;

import org.testng.annotations.Test;

public class TestNgDemo5A {
@Test(priority=1)
public void loginTest()
{
	System.out.println("login test of TestNgDemo5");
	System.out.println(0/0);
}
@Test(priority=2, dependsOnMethods="loginTest")
public void customerDetails()
{
	System.out.println("Customer Detsils of TestNgDemo5");
}
}
