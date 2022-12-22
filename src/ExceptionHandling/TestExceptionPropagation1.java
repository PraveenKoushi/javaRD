package ExceptionHandling;

/* An exception is first thrown from the top of the stack and if it is not caught,
 *  it drops down the call stack to the previous method. If not caught there, the exception again drops down to the previous method, and so on until they are caught or 
 * until they reach the very bottom of the call stack. This is called exception propagation.
 */
class TestExceptionPropagation1{  
	  void m(){  
		  System.out.println("I am into m before exception");
	    int data=50/0;  
	    System.out.println("I am into m after exception");
	  }  
	  
	  
	  void n(){  
		  System.out.println("I am into n");
	    m();  
	  }
	  
	  
	  void p(){  
	   try{  
		   System.out.println("I am into P");
	    n();  
	   }catch(Exception e){System.out.println("exception handled-Divided By Zero");}  
	  } 
	  
	  
	  public static void main(String args[]){  
	   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  


//  I am into P
//  I am into n
// I am into m before exception
// exception handled-Divided By Zero