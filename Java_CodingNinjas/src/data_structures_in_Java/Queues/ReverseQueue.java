package data_structures_in_Java.Queues;

import java.util.Queue;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
	   if(input.size()<=1)
        return;
    
     
     int front=input.peek();
     input.remove();
     reverseQueue(input);
     input.add(front);
	}

}
