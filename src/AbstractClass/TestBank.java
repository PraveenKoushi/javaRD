package AbstractClass;

abstract class Bank{    
	abstract int getRateOfInterest();    
}    
class SBI extends Bank{    
	int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
	int getRateOfInterest(){return 8;}    
}    

class TestBank{    
	public static void main(String args[]){    
		Bank sbi;  
		sbi=new SBI();  
		System.out.println("Rate of Interest is: "+sbi.getRateOfInterest()+"%");    
		Bank pnb=new PNB();  
		System.out.println("Rate of Interest is: "+pnb.getRateOfInterest()+"%");    
	}}    
