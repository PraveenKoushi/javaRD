package collectionframework.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		map.put(1,"Mango");  //Put elements in Map  
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(1,"Grapes"); //trying duplicate key  

		System.out.println("Iterating Hashmap...");  
		for(Entry<Integer, String> m : map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  

	}

}
