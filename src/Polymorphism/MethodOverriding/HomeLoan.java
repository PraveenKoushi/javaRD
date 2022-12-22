package Polymorphism.MethodOverriding;

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank{  
	int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
	int getRateOfInterest(){return 8;}  
} 

class Andra extends Bank
{
	int getRateOfInterest()
	{
		return 6;
		} 
}

class ICICI extends Bank{  
	int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
	int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class HomeLoan{  
	public static void main(String args[]){  
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();
		Andra ad = new Andra();
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
		System.out.println("Andra Bank ROI is " +ad.getRateOfInterest());
		
		System.out.println(ad.hashCode());
	}  
}  
