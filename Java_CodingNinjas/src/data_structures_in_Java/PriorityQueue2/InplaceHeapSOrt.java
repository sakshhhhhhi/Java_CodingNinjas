package data_structures_in_Java.PriorityQueue2;

public class InplaceHeapSOrt {
	public static void heapSort(int[]arr) {
		//building heap
		int n = arr.length;
		for(int i =(n/2)-1;i>=0;i--) {
			downHeapify(arr,i,n);
		}
		//remove elements
		for(int i =n-1;i>=0;i--) {
			int temp =arr[i];
			arr[i] = arr[0];
			arr[0] =temp;
			downHeapify(arr,0,i);
		}
	}

	public static void downHeapify(int[] arr, int i, int n) {
		// TODO Auto-generated method stub
		int parentIndex =i;
		int leftChildIndex = parentIndex*2+1;
		int rightChildIndex = parentIndex*2+2;
		
		if(leftChildIndex<n) {
			int minIndex =parentIndex;
			if(arr[leftChildIndex]<arr[minIndex]) {
				minIndex =leftChildIndex;
			}
			if(rightChildIndex<n&&arr[rightChildIndex]<arr[minIndex]) {
				minIndex =rightChildIndex;
			}
			if(minIndex == parentIndex) {
				return;
			}
			int temp2 = arr[parentIndex];
			arr[parentIndex]=arr[minIndex];
			arr[minIndex]=temp2;
			parentIndex =minIndex;
			leftChildIndex = parentIndex*2+1;
			rightChildIndex = parentIndex*2+2;
		}
	}

	public static void main(String[] args) {
		int arr[]= {4,2,7,1,5,7,3};
		heapSort(arr);
		for(int i :arr) {
		System.out.println(i);
		}
	}

}
