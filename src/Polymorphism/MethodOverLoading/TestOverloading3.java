package Polymorphism.MethodOverLoading;

class Adder3{  
	static int add(int a,int b){return a+b;}  
	static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
	public static void main(String[] args){  
		System.out.println(Adder3.add(11,11));//ambiguity  
	}}  