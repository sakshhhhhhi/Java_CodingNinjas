package data_structures_in_Java.Queues;

import data_structures_in_Java.LinkedList2.Node;

public class QueueUsingLL<T> {
	private Node<Integer>front;
	private Node<Integer> rear;
	private int size=0;


	public QueueUsingLL() {
		//Implement the Constructor
		front =null;
		rear=null;
		size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		Node<Integer> newNode = new Node<>(data);
		size++;
		if(rear==null) {
			front =newNode;
			rear =newNode;
		}
		else {
			rear.next = newNode;
			rear=newNode;
		}
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if(size==0){
			return -1;
		}
		int temp = front.data;
		front =front.next;
		if(front==null){
			rear=null;
		}
		size--;
		return temp;
    }


    public int front() {
    	//Implement the front() function
		if(front==null) {
    		return -1;
    	}
		int temps =front.data;
		return temps;
    }

	
	
}
