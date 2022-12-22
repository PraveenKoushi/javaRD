package Array;

class Testarray3{  
	//creating a method which receives an array as a parameter  
	static void min(int arr[]){  
	int min=arr[0];  
	for(int i=1;i<arr.length;i++)  
	 if(min>arr[i])  
		 min=arr[i];  
	  
	System.out.println("Minimum value is " +min);  
	}  
	  
	public static void main(String args[]){  
	int a[]={33,3,4,5,0,99,-10};//declaring and initializing an array  
	min(a);//passing array to method  
	}}  


