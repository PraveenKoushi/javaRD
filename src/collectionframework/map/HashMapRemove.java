package collectionframework.map;

import java.util.HashMap;

public class HashMapRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav");  
	      
	      System.out.println(map.keySet());
	      System.out.println(map.size());
	      map.clear();
	      System.out.println(map.size());
	    
	    

	}

}
