package Interfaces;

interface Drawable10{  
	abstract void draw();  
	default void msg(){System.out.println("default method");}  
}  
class Rectangle10 implements Drawable10{  
	public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
	public static void main(String args[]){  
		Drawable10 d=new Rectangle10();  
		d.draw();  
		d.msg();  
	}}  
