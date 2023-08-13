package data_structures_in_Java.Stacks;

public class StackUsingArray {
	private int data[];
	private int topElement;
	
	public StackUsingArray(){
		data = new int[10];
		topElement =-1;
		
	}
	
	public boolean isEmpty() {
		
		return topElement==-1;
	}

	public int top() throws StackEmptyException{
		if(topElement==-1) {
			throw new StackEmptyException();
		}
		return data[topElement];
		
	}

	public int pop()throws StackEmptyException{
		if(topElement==-1) {
			throw new StackEmptyException();
		}
		int temp = data[topElement]; 
		topElement--;
		return temp;
	}

	public void push(int element)throws fullStackException {
		if(topElement==data.length-1) {
//			throw new fullStackException();
			doubleCapacity();
		}
		
		data[++topElement]= element;
		
	}
	
	private void doubleCapacity() {
		int[]temp =data;
		data = new int[2*temp.length];
		for(int i =1;i<temp.length;i++)
		data[i]=temp[i];
	}

	public int size() {
		return topElement++;
	}
}
