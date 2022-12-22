package Interfaces;

interface Printable{  
	void print();  
}  
class PrintableImpl implements Printable{  
	public void print(){System.out.println("Hello");}  

	public static void main(String args[]){  
		PrintableImpl obj = new PrintableImpl();  
		obj.print();  
	}  
}  
