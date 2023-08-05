package data_structures_in_Java.PriorityQueue2;

import java.util.PriorityQueue;

public class KthLargestElement {
	public static int kthLargest(int n, int[] input, int k) {
		n = input.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		if(n==0) {
			return Integer.MAX_VALUE;
		}
		for(int i =0;i<k;i++) {
			pq.add(input[i]);
		}
		for(int i =0;i<input.length;i++) {
			int min = pq.peek();
			if(min<input[i]) {
				pq.remove();
				pq.add(input[i]);
			}
		}
		return pq.remove();

	}

}
