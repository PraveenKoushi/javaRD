package Polymorphism.MethodOverriding;

class Vehicle{  
	//defining a method  
	void run(){System.out.println("Vehicle is running");}  
} 

class Car extends Vehicle
{
	void run()
	{
		System.out.println("I am driving Car");
	}

}




//Creating a child class  
class Bike extends Vehicle{  
	//defining the same method as in the parent class  
	void run(){System.out.println("I am driving Scooty daily");}  

	public static void main(String args[]){  
		Car obj = new Car();//creating object  
		obj.run();//calling method  
	}  


}


