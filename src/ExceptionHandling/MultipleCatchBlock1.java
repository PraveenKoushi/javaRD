package ExceptionHandling;

public class MultipleCatchBlock1 {  
	  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
               // a[5]=30/0;
                
                int k = a[10];
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }
              
           catch(IndexOutOfBoundsException e)
           {
        	   System.out.println("IndexOutOfBoundsException " +e);
           }
 
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  