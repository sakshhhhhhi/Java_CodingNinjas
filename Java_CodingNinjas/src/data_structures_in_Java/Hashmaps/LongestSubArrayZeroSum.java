package data_structures_in_Java.Hashmaps;

import java.util.HashMap;

public class LongestSubArrayZeroSum {
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
	 HashMap<Integer,Integer> map = new HashMap<>();
     int sum=0,maxLen=-1;
     for (int i=0;i<arr.length;i++)
     {
         sum=sum+arr[i];
         if (sum==0)
         {
             maxLen=i+1;
         }
         if (map.containsKey(sum))
         {
             int prevIndex=map.get(sum);
             int currLen=i-prevIndex;
             if (currLen>maxLen)
             {
                 maxLen=currLen;
             }
         }
         else
         {
             map.put(sum,i);
         }
     }
     return maxLen;
	}

}
