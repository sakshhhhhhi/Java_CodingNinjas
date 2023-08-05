package data_structures_in_Java.PriorityQueue2;

import java.util.*;


public class KSmallestElements {
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
		n =input.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<k;i++){
			pq.add(input[i]);
		}
		for(int i=k;i<n;i++){
			if(pq.peek()>input[i]){
				pq.poll();
				pq.add(input[i]);
			}
		}
		for(int i =0;i<k;i++){
			list.add(pq.poll());
		}
		return list;


	}
	public static void main(String[] args) {
		int arr[]= {1,4,2,42,41,5,2,64};
		int k =4;
		int n =arr.length;
		System.out.println(kSmallest(n,arr,k));
	}

}
