package data_structures_in_Java.DynamicProgramming2;

public class KnapsackProblemR {
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
		return knapsack(weights, values, n, maxWeight, 0);
	}
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight, int i) {
		if(i==n) {
			return 0;
		}
		int maxValue=0;
		if(weights[i]>maxWeight){
			maxValue = knapsack(weights, values, n, maxWeight, i+1);
			
		}
		if(weights[i]<=maxWeight){
			 int ans1 = values[i]+knapsack(weights, values, n, maxWeight-weights[i], i+1);
			 int ans2 = knapsack(weights, values, n, maxWeight, i+1);
			 maxValue=Math.max(ans1, ans2);
		}
		return maxValue;

}
}


