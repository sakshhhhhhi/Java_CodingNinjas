package data_structures_in_Java.DynamicProgramming1;

public class LootHouses {
	public static int maxMoneyLooted(int[] houses) {
		int n =houses.length;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return houses[0];
		}
		if(n==2) {
			return Math.max(houses[0], houses[1]);
		}
		
		int []dp = new int[n];
		dp[0] = houses[0];
		dp[1] = Math.max(houses[0], houses[1]);
		for(int i =2;i<n;i++) {
			int max =dp[i-2]+houses[i];
			int max2 =dp[i-1];
			dp[i] = Math.max(max, max2);
		}
		return dp[n-1];
		
		
	}
	public static void main(String[] args) {
		int [] arr = {5, 5,10 ,1,1,5};
		System.out.println(maxMoneyLooted(arr));
	}

}
