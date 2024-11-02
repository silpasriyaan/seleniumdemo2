package Seminars;

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
     //d.show(); 
 d.sriyaan();
 
 } 
} 