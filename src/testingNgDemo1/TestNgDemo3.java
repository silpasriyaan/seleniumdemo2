package testingNgDemo1;

import org.testng.annotations.Test;

public class TestNgDemo3 {
public static void main(String[] args)
{
	System.out.println("Main method of TestNgDemo1");
}
@Test(priority=3)
public void funA()
{
	System.out.println("FunA of TestNgDemo3");
}
@Test(priority=1)
public void funB()
{
	System.out.println("FunB of TestNgDemo3");
}
@Test(priority=-4)
public void funC()
{
	System.out.println("FunC of TestNgDemo1");
}
@Test(priority=2)
public void funD()
{
	System.out.println("FunD of TestNgDemo1");
}
}
