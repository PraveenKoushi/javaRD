package FinalModTesting;

final class TestFinal {
	
	int x=30;
	
final public void show()
	{
		System.out.println("I am into TestFinal method");
	}
}

class Child extends System
{
	public void display();
	

	
	public static void main(String[] args)
	{
		TestFinal tf = new TestFinal();
		tf.x=90;
	}
}

	