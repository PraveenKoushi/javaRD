package Variables;

public class StaticInstance {  
    public void myMethod()   
  {  
  System.out.println("Method");  
  }  
    
  {  
  System.out.println(" Instance Block");  
  }  
        
  public void StaticInstance()  
  {  
  System.out.println("Constructor ");  
  }  
  static {  
      System.out.println("static block");  
  }  
  public static void main(String[] args) {  
	  StaticInstance c = new StaticInstance();  
  c.StaticInstance();  
  c.myMethod();  
}  
}   