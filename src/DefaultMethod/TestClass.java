package DefaultMethod;

class TestClass implements TestInterface 
{ 
// implementation of square abstract method 
public void square(int a) 
{ 
   System.out.println(a*a); 
} 

public static void main(String args[]) 
{ 
   TestClass d = new TestClass(); 
   d.square(4); 

   // default method executed 
  // d.show(); 
d.sriyaan();

} 
}