package testingNgDemo1;

import org.testng.annotations.Test;

public class TestNgArifDemo1 {
@Test(priority=-8)	
public void funA()
{
	System.out.println("funA");
}
@Test(priority=-20)
public void funB(){
	System.out.println("funB");

}
@Test(priority=8)
public void funC(){
	System.out.println("funC");

}

}
