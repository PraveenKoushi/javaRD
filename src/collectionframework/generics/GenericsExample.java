package collectionframework.generics;

import java.util.ArrayList;

/*
 Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.

Java new generic collection allows you to have only one type of object in a collection. Now it is type safe so typecasting is not required at runtime.

Let's see the old non-generic example of creating java collection.

ArrayList list=new ArrayList();//creating old non-generic arraylist  
Let's see the new generic example of creating java collection.

ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  
In a generic collection, we specify the type in angular braces. Now ArrayList is forced to have the only specified type of objects in it. If you try to add another type of object, it gives compile time error.

For more information on Java generics, click here Java Generics Tutorial.
 */

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object   
	      System.out.println(list);  

	}

}
