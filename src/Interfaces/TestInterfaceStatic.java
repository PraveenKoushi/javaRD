package Interfaces;

interface Drawable1{  
	void draw();  
	static int cube(int x){return x*x*x;}  
}  
class Rectangle1 implements Drawable1{  
	static int x=10;
	public void draw(){System.out.println("drawing rectangle");}  
}  

class TestInterfaceStatic{  
	public static void main(String args[]){  
		Drawable1 d=new Rectangle1();  
		d.draw();  
		System.out.println(Drawable1.cube(3));
		
		Rectangle1 r1 = new Rectangle1();
		System.out.println(r1.x);
		System.out.println(Rectangle1.x);
		
		
		Rectangle1 r2 = new Rectangle1();
		Rectangle1 r3 = new Rectangle1();
		
		System.out.println("r2  :" +r2.x);
		System.out.println("r3 :" +r3.x);
	}}  

