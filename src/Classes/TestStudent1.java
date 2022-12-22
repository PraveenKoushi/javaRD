package Classes;

//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student{  
	int id;  
	String name;  
	
	
	
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
		
		System.out.println("I am into constructor");
	}
}  
//Creating another class TestStudent1 which contains the main method  
class TestStudent1{  
	public static void main(String args[]){  
		
		Student s1 = new Student(101,"Priyanka");
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		
		
		Student s2 = new Student(102,"Thousifa");
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		
		
		
	 
	}  
}  