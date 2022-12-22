package collectionframework.listinteface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list1= new ArrayList();      // ArrayList implementation
		List <Integer> list2 = new LinkedList();    // LinkedList implementation
		List <Float> list3 = new Vector();  
		List <String> list4 = new Stack(); 
		
		
		// ArrayList implementation example
		list1.add("Amulya");
		list1.add("laxmi");
		
		System.out.println(list1);
		
		list2.add(20);
		list2.add(40);
		list2.add(new Integer(80));
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		

	}

}
