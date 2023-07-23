package data_structures_in_Java.Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class PrintIntersection {
	
	public static void main(String[] args) {
		int [] arr1 = {2,3,4,5,2,6};
		int [] arr2 = {2,6,1,2,6,4};
		printIntersection(arr1,arr2);
	}

	public static void printIntersection(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int key:arr1) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		Arrays.sort(arr2);
		for(int key:arr2) {
			if(map.containsKey(key)) {
				int val =map.get(key);
				if(val>0) {
					System.out.println(key);
					map.put(key, val-1);
				}
			}
		}
		
	}


}
