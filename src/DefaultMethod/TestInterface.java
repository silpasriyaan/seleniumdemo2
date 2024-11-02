package DefaultMethod;

//A simple program to Test Interface default 
//methods in java 
interface TestInterface 
{ 
// abstract method 
public void square(int a); 

// default method 
//default void show() 
default void sriyaan() 
{ 
 System.out.println("Default Method of java8 is Executed"); 
} 
} 


