package typecasting;
//  byte -> short -> char -> int -> long -> float -> double  
/*Widening Type Casting
Converting a lower data type into a higher one is called widening type casting. 
It is also known as implicit conversion or casting down. It is done automatically. 
It is safe because there is no chance to lose data. It takes place when: */
public class WideningExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 7;  
		//automatically converts the integer type into long type  
		long y = x;  
		//automatically converts the long type into float type  
		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);  

	}

}
