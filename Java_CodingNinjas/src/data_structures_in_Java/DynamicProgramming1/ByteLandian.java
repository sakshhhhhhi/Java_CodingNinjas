package data_structures_in_Java.DynamicProgramming1;

import java.util.HashMap;

public class ByteLandian {
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
		 if (n<12)
	        {
		   memo.put(n,n);
           return n;
       }
       
       if (!memo.containsKey(n))
       {
           long ans1=bytelandian(n/2,memo);
       	   long ans2=bytelandian(n/3,memo);
           long ans3=bytelandian(n/4,memo);
       
	       	long currVal=ans1+ans2+ans3;
	       	if (currVal>n)
	           	memo.put(n,currVal);
	       	else
	           	memo.put(n,n);
           
       }
       
       return memo.get(n);

	}
	//using array
	/*
	public static int bytelandian(int n) {
		int [] dp = new int[n+1];
		dp[0]=0;
		for(int i =1;i<=n;i++) {
			dp[i]=i;
			dp[i] = Math.max(dp[i], dp[i/2]+dp[i/3]+dp[i/4]);
		}
		return dp[n];
		
	}
	public static void main(String[] args) {
		System.out.println(bytelandian(27));
	}*/

}
