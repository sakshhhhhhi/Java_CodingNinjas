package data_structures_in_Java.PriorityQueue2;

public class CheckMaxHeap {
	public static boolean checkMaxHeap(int arr[]) {
		for(int i =0;i<arr.length;i++){
			 int parentIndex =i;
			 int leftChildIndex =2*parentIndex+1,rightChildIndex=2*parentIndex+2;
			 if(leftChildIndex<arr.length&&arr[leftChildIndex]>arr[parentIndex]){
				 return false;
			 }
			  if(rightChildIndex<arr.length&&arr[rightChildIndex]>arr[parentIndex]){
				 return false;
			 }
		 }
		 return true;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {42,20, 18, 6, 74, 11, 9, 4};
		System.out.println(checkMaxHeap(arr));

	}
	
}
