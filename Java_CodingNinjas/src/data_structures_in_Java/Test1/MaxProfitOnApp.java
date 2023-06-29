package data_structures_in_Java.Test1;

import java.util.Arrays;

public class MaxProfitOnApp {
	
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
		int ans = Integer.MIN_VALUE;
		int n = budget.length;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, budget[i] * (n - i));
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
