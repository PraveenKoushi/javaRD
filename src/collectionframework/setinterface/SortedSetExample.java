package collectionframework.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 
 SortedSet is the alternate of Set interface that provides a total ordering on its elements. 
 The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

The SortedSet can be instantiated as:

TreeSet :

Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, TreeSet also 
contains unique elements. However, the access and retrieval time of TreeSet is quite fast. 
The elements in TreeSet stored in ascending order.

Consider the following example:
 
 */

// A-Z , the ASCII value of uppercase alphabets are from 65 to 90
// a-z alphabet a is stored as 97 and alphabet z is stored as 122.
public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<String> set = new TreeSet();  
		set.add("Ravi");  
		set.add("Vijay");  //4
		set.add("Ravi");  //2
		set.add("Ajay");  //1
		set.add("Thosifa"); //3
		set.add("ajay");
		set.add("Yamini");
		//set.clear();
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		
		}  

	}

}
