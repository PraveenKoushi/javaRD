package Interfaces;

interface Bank{  
	float rateOfInterest();  
}  
class SBI implements Bank{  
	public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
	public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
	public static void main(String[] args){  
		float pnbI;
		Bank b=new SBI();  
		System.out.println("SBI ROI: "+b.rateOfInterest());  
		Bank pnb = new PNB();
		pnbI=pnb.rateOfInterest();
		System.out.println("Rate of Interest for PNB is " +pnbI);
	}}  
