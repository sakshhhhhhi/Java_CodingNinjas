package data_structures_in_Java.Hashmaps;

import java.util.*;

public class MaximumFrequencyNumber {
//	public static void main(String[] args) {
//		int [] arr = {1,2,3,2,3,1,4,5,2,1,6,6,6,6,6,6,4};
//		int output = maxFrequencyNumber(arr);
//		System.out.println(output);
//	}

	public static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		int maxCount =Integer.MIN_VALUE;
		int maxElement =arr[0];
		for(int i =0;i<arr.length;i++) {
			if(map.get(arr[i])>maxCount) {
				maxCount=map.get(arr[i]);
				maxElement =arr[i];
			}
		}
		return maxElement;
	}

}
