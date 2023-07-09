package data_structures_in_Java.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsing2Queues {
	Queue<Integer> mainQ;
	Queue<Integer> helperQ;

	 public StackUsing2Queues() {
		 mainQ= new ArrayDeque<>();
		 helperQ= new ArrayDeque<>();
	    }
	 public int getSize() { 
	        return mainQ.size();
	    }

	 public boolean isEmpty() {
	       return mainQ.isEmpty();
	    }

	 public void push(int element) {
	        // complexity o(1)
		 mainQ.add(element);
	    }

	 public int pop() {
	        if(getSize()==0) {
	        	return -1;
	        }
	        else {
	        	while(mainQ.size()>1) {
	        		helperQ.add(mainQ.remove());
	        	}
	        	int val = mainQ.remove();
	        	
	        	while(helperQ.size()>0) {
	        		mainQ.add(helperQ.remove());
	        	}
	        	return val;
	        }
	    }

	 public int top() {
		 if(getSize()==0) {
	        	return -1;
	        }
	        else {
	        	while(mainQ.size()>1) {
	        		helperQ.add(mainQ.remove());
	        	}
	        	int val = mainQ.remove();
	        	helperQ.add(val);
	        	while(helperQ.size()>0) {
	        		mainQ.add(helperQ.remove());
	        	}
	        	return val;
	        }
	    }
	 public static void main(String[] args) {
		StackUsing2Queues st = new StackUsing2Queues();
		st.push(2);
		st.push(3);
		System.out.println(st.pop());
		System.out.println(st.getSize());
		System.out.println(st.isEmpty());
	}

}
