package AccessModifiers;

class A{  
	private A(){}//private constructor  
	void msg(){System.out.println("Hello java");}  
}  
public class PrivateConstructor{  
	public static void main(String args[]){  
		A obj=new A();//Compile Time Error  
	}  
}  