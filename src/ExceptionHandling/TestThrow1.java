package ExceptionHandling;

public class TestThrow1 {   
	//function to check if person is eligible to vote or not   
	public static void validate(int age, String s) {  
		if(age<18) {  
			//throw Arithmetic exception if not eligible to vote
			
			String newmsg = "Person is not eligible to vote--  " +s;
			throw new ArithmeticException(newmsg);    
		}  
		else {  
			String newmsg = "Person is  eligible to vote--  " +s;
			System.out.println(newmsg);  
		}  
	}  
	//main method  
	public static void main(String args[]){  
		//calling the function  
		validate(20, "Manasa");  
		System.out.println("rest of the code...");    
	}    
}    
