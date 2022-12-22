package collectionframework.listinteface;

import java.util.Iterator;
import java.util.LinkedList;



/*

 LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
  It can store the duplicate elements. It maintains the insertion order and is not synchronized.
   In LinkedList, the manipulation is fast because no shifting is required.

Consider the following example.

 */


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfs

		LinkedList<String> al=new LinkedList<String>();  
		al.add("Amulya");//Adding object in arraylist  
		al.add("Laxmi");
		al.add("Amulya");
        //Add values here
		//Traversing list through Iterator  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  

}