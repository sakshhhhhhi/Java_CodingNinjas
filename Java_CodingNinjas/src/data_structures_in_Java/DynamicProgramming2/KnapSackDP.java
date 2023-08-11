package data_structures_in_Java.DynamicProgramming2;

public class KnapSackDP {
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		int [][]dp = new int[n+1][maxWeight+1];
		for(int i=n-1;i>=0;i--) {
			for(int w =0;w<=maxWeight;w++) {
				int ans =0;
				if(weights[i]<=w) {
					int ans1 = values[i]+dp[i+1][w-weights[i]];
					int ans2 = dp[i+1][w];
					ans =Math.max(ans1, ans2);
				}
				else {
					ans =dp[i+1][w];
				}
				dp[i][w]=ans;
			}
			
		}
		return dp[0][maxWeight];
	}
	public static void main(String[] args)  {
        
        int[] weights = {1,2,4,5};
        int[] values = {5,4,8,6};
        int maxWeight=5, s = 4;
        System.out.println(knapsack(weights, values, s, maxWeight));
    }

}
