package collectionframework.setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetForAnotherCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();  
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ajay");  
		list.add("Ravi");

		HashSet<String> set=new HashSet(list);  
		set.add("Gaurav");  
		Iterator<String> i=set.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  

	}

}
