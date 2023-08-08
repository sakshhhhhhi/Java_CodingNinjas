package data_structures_in_Java.DynamicProgramming1;

public class MinimumNumberofSquaresDP {
	public static int minCount(int n) {
		int []dp = new int[n+1];
		dp[0] =0;
		 
		for(int i =1;i<=n;i++){
			int minAns= Integer.MAX_VALUE;
			for(int j =1;j*j<=i;j++){
				int ans = dp[i-(j*j)];
				if(minAns>ans){
					minAns=ans;
				}
			}
			dp[i] = 1+minAns;
		}
		return dp[n];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCount(10));

	}

}
