package datas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) 
	{
		Queue<String> locationsQueue = new LinkedList<>();
	        		locationsQueue.add("kolkata");
	        		locationsQueue.add("london");
	        		locationsQueue.add("Delhi");
	        		locationsQueue.add("puna");
	        		locationsQueue.add("rajesthan");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}


}
