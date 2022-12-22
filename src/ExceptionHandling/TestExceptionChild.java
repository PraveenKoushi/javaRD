package ExceptionHandling;

import java.io.*;    
class Parent{   

	// defining the method   
	void msg() throws IOException {  
		System.out.println("parent method");  
	}    
}    

public class TestExceptionChild extends Parent{    

	// overriding the method in child class  
	// gives compile time error  
	void msg() {    
		System.out.println("I am over riding Base exception class method");    
	}  

	public static void main(String args[]) throws IOException {    
		Parent p = new TestExceptionChild();    
		p.msg();    
	}    
}    