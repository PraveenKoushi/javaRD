package Inheritance;

class Animal10{  
	String color="white";  
}  
class Dog10 extends Animal10{  
	String color="black";  
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
}  
class TestSuper{  
	public static void main(String args[]){  
		Dog10 d=new Dog10();  
		d.printColor();  
	}}  
