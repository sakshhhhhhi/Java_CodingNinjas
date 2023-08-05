package data_structures_in_Java.PriorityQueue;

import java.util.ArrayList;

public class Priority_Queue <T>{
	private ArrayList<Element<T>> heap;
	public Priority_Queue() {
		heap =new ArrayList<>();
	}
	public void insert(T value,int priority) {
		Element<T> newEle = new Element<>(value, priority);
		heap.add(newEle);
		int childIndex = heap.size()-1;
		int parentIndex =(childIndex-1)/2;
		
		
		while(childIndex>0) {
			if(heap.get(childIndex).priority<heap.get(parentIndex).priority) {
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex =parentIndex;
				parentIndex =(childIndex-1)/2;
			}
			else {
				return;
			}
			
		}	
	}
	public T getMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0).value;
		
	}
	
	public T removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		T minEle =getMin();
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex +1,rightChildIndex =2*parentIndex +2;
		
		while(leftChildIndex<heap.size()) {
			int minIndex =parentIndex;
			if(heap.get(leftChildIndex).priority<heap.get(parentIndex).priority) {
				minIndex =leftChildIndex;
			}
		    if(rightChildIndex<heap.size()) {
		    	minIndex =rightChildIndex;
		    }
		    if(minIndex==parentIndex) {
		    	return minEle;
		    }
		    Element<T> temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(minIndex));
            heap.set(minIndex,temp);
            
            parentIndex=minIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return minEle;
		}
		
		
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
