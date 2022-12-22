package AccessModBase;

class Base{  
	
	int x=100;
	//protected int x=150;
	//protected void msg(){System.out.println("Hello----");} 
	
	public void display()
	{
		System.out.println("Public access modifier- With in the class " +x);
	}
}  

public class A extends Base
{
	
public static void main(String[] args)
{
	A obj = new A();
	obj.display();
	System.out.println(obj.x);
	
	Base b = new Base();
	b.display();
	
	
}
}
