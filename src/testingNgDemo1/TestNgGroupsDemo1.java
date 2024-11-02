package testingNgDemo1;

import org.testng.annotations.Test;

public class TestNgGroupsDemo1 {//Sanity
	@Test(groups="Sanity")
public void funA()
{
	System.out.println("funA of TestngGroupsDemo");
}
@Test(groups="Sanity")
public void funB()
{
	System.out.println("funB of TestngGroupsDemo");
}
@Test(groups="Regression")
public void funC()
{
	System.out.println("funC of TestngGroupsDemo");
}
@Test(groups="Regression")
public void funD()
{
	System.out.println("funD of TestngGroupsDemo");
}

}
