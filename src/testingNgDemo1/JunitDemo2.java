package testingNgDemo1;

import org.junit.Test;

public class JunitDemo2 {

		@Test
public void funA()
{
	System.out.println("funA of JunitDemo2");
}
		@Test
public void funB()
{
System.out.println("FunB of JunitDemo2");
System.out.println(0/0);
}
}
