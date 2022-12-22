package Polymorphism.MethodOverriding;

class Animal{  
	void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
	void eat(){System.out.println("eating bread...");}  
}  
class Cat extends Animal{  
	void eat(){System.out.println("eating rat...");}  
}  
class Lion extends Animal{  
	void eat(){System.out.println("eating meat...");}  
}  
class Animals{  
	public static void main(String[] args){  
		Animal a = new Animal();
		a.eat();
		
		Animal b;
		b=new Dog();
		b.eat();
		
		Animal c;
		c=new Cat();
		c.eat();
		
		Animal d;
		d=new Lion();
		d.eat();
		
		
	}}  