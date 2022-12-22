/*
 
 Queue interface maintains the first-in-first-out order. 
 It can be defined as an ordered list that is used to hold the elements which are about to be processed. 
 There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

Queue interface can be instantiated as:
 
 */


package collectionframework.queueinterface;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q1 = new PriorityQueue();  
		Queue<String> q2 = new ArrayDeque();  

	}

}
