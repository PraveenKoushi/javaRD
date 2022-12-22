package collectionframework.setinterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 LinkedHashSet class represents the LinkedList implementation of Set Interface.
  It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements.
   It maintains the insertion order and permits null elements.

Consider the following example
 */
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay"); 
		set.add(null);
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
