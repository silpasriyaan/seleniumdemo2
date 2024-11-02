package SeleniumDemosPgm;

public class TestAB {
TestA t1=new TestB();
//TestB t2=new TestA();
TestB t3=(TestA)new TestA(); // Run time Exception
//TestB t4=t1; Compile time error
TestB t4=(TestB)t1;
System.out.println("Done");
}
