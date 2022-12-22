package Inheritance;

class An{  
	void eat(){System.out.println("eating...");}  
}  
class Dg extends An{  
	void bark(){System.out.println("barking...");}  
}  
class Single{  
	public static void main(String args[]){  
		Dg d=new Dg();  
		d.bark();  
		d.eat();  
	}}  
