package collectionframework.setinterface;

import java.util.HashSet;

public class HashSetRemoveOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();  
        set.add("Thousifa");  
        set.add("Vijay");  
        set.add("Arun");  
        set.add("Sumit");  
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("Vijay"));    
        System.out.println("After invoking removeIf() method: "+set);  
        
        System.out.println(set.hashCode());
      
	}

}
