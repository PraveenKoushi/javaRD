package Variables;

public class Scope    
{  
	static int j=15;
	
	final static int k=85;
	
	public void dispaly()
	{
		j=j+40;
		k=k+10;

		
		System.out.println("Value of J in display " +j);
	}
	
	
	
    public static void main(String args[])  
    {  
    	int i=100;
    	System.out.println("Testing the scope of variables");
    	for(i=1;i<=3;i++)
    	{
    		System.out.println(i);
    	}
    	//System.out.println("After the for loop " +i);
    	System.out.println("The value of J is  " +Scope.j);
    	
//    	Scope s= new Scope();
  //  	System.out.println("Object creation for getting the scope of J  " +s.j);
   	
    	Scope s= new Scope();
    	s.dispaly();  
    	System.out.println(Scope.k);
    	
    	
    	        
    }  
}  
