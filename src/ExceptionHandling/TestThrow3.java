package ExceptionHandling;


class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
      super(str); 
    	//System.out.println(str);
      
     
    }  
}  
// Class that uses above MyException  
public class TestThrow3  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception prepard by Core Java Team");  
        }  
        catch (UserDefinedException ude)  
        {  
        	//Exception e;
        	//e.getMessage()
        	
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}   