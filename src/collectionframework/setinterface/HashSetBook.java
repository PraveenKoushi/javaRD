package collectionframework.setinterface;

import java.util.HashSet;

class Book2 {  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book2(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}  
}	  
public class HashSetBook {  
	public static void main(String[] args) {  
		HashSet<Book2> set=new HashSet<Book2>();  
		//Creating Books  
		Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);  
		//Adding Books to HashSet  
		set.add(b1);  
		set.add(b2);  
		set.add(b3);  
		//Traversing HashSet  
		for(Book2 b:set){  
			
			
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		}  


	}

}

