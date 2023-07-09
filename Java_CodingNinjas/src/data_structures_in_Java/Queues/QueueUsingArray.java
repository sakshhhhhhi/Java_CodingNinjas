package data_structures_in_Java.Queues;

public class QueueUsingArray {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public QueueUsingArray() {
		arr=new int[5];
		front =-1;
		rear=-1;
	}
	public QueueUsingArray(int capacity) {
		arr =new int[capacity];
		front =-1;
		rear= -1;
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0|| front==-1;
	}
    public void enqueue(int elem) {
    	if(size==arr.length) {
    		return;
    	}
    	if(size==0) {
    		front=0;
    	}
//    	rear++;
//    	if(rear==arr.length) {
//    		rear =0;
//    	}
    	rear =(rear+1)%arr.length;
		arr[rear]=elem;
		size++;
	}
	
	public int front() {
		if(size==0) {
			return -1;
		}
		return arr[front];
	}
	
	
	public int dequeue() {
		if(size==0) {
			doubleCapacity();
		}
		int temp = arr[front];
//		front++;
//		if(front==arr.length) {
//			front = 0;
//		}
		front =(front+1)%arr.length;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
	}
	private void doubleCapacity() {
		int[] temp =arr;
		arr= new int[2*temp.length];
		int index =0;
		for(int i=front;i<temp.length;i++) {
			arr[index++]=temp[i];
		}
		for(int i=0; i<front-1;i++) {
			arr[index++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
	}
	

}
