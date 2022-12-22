package Inheritance;
class Animals{  
	String color="Red";  
}  
class Dog extends Animals{  
	String color="black";  
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		//System.out.println(super.color);//prints color of Animal class  
	}  
}  
class Animal{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
	}}  
