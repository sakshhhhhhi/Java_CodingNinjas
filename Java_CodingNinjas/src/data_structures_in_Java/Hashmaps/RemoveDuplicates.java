package data_structures_in_Java.Hashmaps;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr = {1,2,3,2,3,1,4,5,2,1,6,6,4};
		ArrayList<Integer>output = removeDuplicates(arr);
		System.out.println(output);
	}

	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		
		ArrayList<Integer> output = new ArrayList<>();
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			continue;
		}
	    output.add(arr[i]);
	    map.put(arr[i], true);
	    
		}
		return output;
	}

}
