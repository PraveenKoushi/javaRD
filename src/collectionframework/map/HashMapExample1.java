package collectionframework.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Manasa");  //Put elements in Map  
		   map.put(2,"Priyana");    
		   map.put(3,"Lakshmi");   
		   map.put(4,"Thousifa");   
		   map.put(5, "Amulya");
		   map.put(6, "Amulya");
		   map.put(100, "Amulya");
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+"  --------- "+m.getValue());
		   }  

	}

}
