package ExceptionHandling;

public class Arthmetic{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	    int data=100/0;  
	   }catch(ArithmeticException e){System.out.println(e);}  
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	}  

/*

String s=null;  
System.out.println(s.length());//NullPointerException  


String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException 

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  

*/
