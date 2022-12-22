package collectionframework.listinteface;

import java.util.ArrayList;
import java.util.Iterator;

/*
 
 The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate
  element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. 
  The elements stored in the ArrayList class can be randomly accessed.
  Consider the following example.
 
 */

public class ArrayListEaxmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 
		 stundentName = "Thosifa";
		 studentClass = "CSC";
		 sectionName = "C"
		 
		 */
		
		
		ArrayList<String> alist=new ArrayList<String>();//Creating arraylist  
		alist.add("Manasa");
		alist.add("Thosifa");
		System.out.println("Students list size is " +alist.size());
		Iterator itr = alist.listIterator();
		
		System.out.println("Iterating Array List starts");
		while(itr.hasNext())
		{
		String studentName=itr.next().toString();
		if(studentName.equalsIgnoreCase("Thosifa"))
		{
			System.out.println("Student record found");
		}
		else
		{
			System.out.println("Student not found");
		}
		}
		
		System.out.println("Iterating Array List ends");
			
	}

}
