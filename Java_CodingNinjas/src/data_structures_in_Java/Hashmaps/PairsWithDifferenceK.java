package data_structures_in_Java.Hashmaps;

import java.util.HashMap;

public class PairsWithDifferenceK {
	public static void main(String[] args) {
		int [] arr = {2,1,-2,2,3,2,2,1,5,4,0};
		int output = getPairsWithDifferenceK(arr,4);
		System.out.println(output);
	}
	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int pairCount = 0;
		for(int item:arr) 
		{
			int p1 = item + k;
			boolean flag = false;
			if(item == p1) 
			{
				flag = true; //this case is there for k=0
			}
			if(map.containsKey(p1)) 
			{
			  pairCount += map.get(p1);	
			}
			int p2 = item - k;
			if(map.containsKey(p2) && !flag)
			{
				pairCount += map.get(p2);
			}
			if(map.containsKey(item)) {
				map.put(item, map.get(item)+1);
			}else {
				map.put(item, 1);
			}
		}
		return pairCount;
	}

}
