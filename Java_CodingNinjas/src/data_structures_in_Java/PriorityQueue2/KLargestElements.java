package data_structures_in_Java.PriorityQueue2;

import java.util.*;

public class KLargestElements {
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0;i<k;i++) {
			pq.add(input[i]);
		}
		for(int i =k;i<input.length;i++) {
			if(pq.peek()<input[i]) {
				pq.poll();
				pq.add(input[i]);
				

			}
		}
		for(int i =0;i<k;i++) {
		list.add(pq.poll());
		}
		return list;
	}
	public static void main(String[] args) {
		int arr[]= {1,4,2,42,41,5,2,64};
		int k =4;
		System.out.println(kLargest(arr,k));
	}

}
