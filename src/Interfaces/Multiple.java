package Interfaces;

interface Printable1{  
	void print();  
}  
interface Showable{  
	void show(); 
	void print();
}  
class Multiple implements Printable1,Showable{  
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  

	public static void main(String args[]){  
		Multiple obj = new Multiple();  
		obj.print();  
		obj.show();  
	}  
}  
