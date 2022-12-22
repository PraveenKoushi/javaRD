package ExceptionHandling;

// Example in case subclass overridden method declares subclass exception

import java.io.*;    
class Parent1{    
  void msg()throws Exception {  
    System.out.println("parent method");  
  }    
}    
    
class TestExceptionChild4 extends Parent1{    
  void msg()throws ArithmeticException {  
    System.out.println("child method");  
  }    
    
  public static void main(String args[]){    
   Parent1 p = new TestExceptionChild4();    
     
   try {    
   p.msg();    
   }  
   catch(Exception e) {}    
  }    
}    