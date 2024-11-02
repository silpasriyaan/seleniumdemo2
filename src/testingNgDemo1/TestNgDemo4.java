package testingNgDemo1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgDemo4 {
public static void main(String[] args)
{
	System.out.println("Main method of TestNgDemo1");
}
@Test
public void funA()
{
	System.out.println("FunA of TestNgDemo4");
}
@Test
public void funB()
{
	System.out.println("FunB of TestNgDemo4");
	System.out.println(0/0);
}
@Test
public void funC() throws Exception
{
	System.out.println("FunC of TestNgDemo4");
	//throw new Exception();
	throw new SkipException("Func skipped");
}
@Test(enabled=false)
public void funD()
{
	System.out.println("FunD of TestNgDemo4");
}
}
