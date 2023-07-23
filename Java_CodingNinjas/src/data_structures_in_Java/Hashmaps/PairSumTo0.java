package data_structures_in_Java.Hashmaps;

import java.util.HashMap;

public class PairSumTo0 {
	public static void main(String[] args) {
		int [] arr = {2,1,-2,2,3};
		int output = PairSum(arr,5);
		System.out.println(output);
	}
	public static int PairSum(int[] input, int size) {
		int count =0;
		HashMap<Integer,Integer> map =new HashMap<>();
		for(int i :input) {
			/*logic : since it is a pair sum can be zero only if it has its complement in the hashmap 
			e.g. 2 and its sum will be zero only if the other number is -2*/
			int complement = -i;
			if(map.containsKey(complement)) {
				count+=map.get(complement);
			}
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		return count;
		
	}

}
