package data_structures_in_Java.DynamicProgramming2;

public class MinCostPathProblem {
	public static int minCostPath(int[][] input) {
		return minCostPathHelper(input,0,0);
		
	}
	public static int minCostPathHelper(int[][] input, int i , int j ) {
		int m = input.length;
		int n =input[0].length;
		if(i==m-1&&j==n-1) {
			return input[i][j];
		}
		if(i>=m||j>=n) {
			return Integer.MAX_VALUE;
		}
		int down =minCostPathHelper(input,i+1,j);
		int right =minCostPathHelper(input,i,j+1);
		int dia =minCostPathHelper(input,i+1,j+1);
		
		int Ans = input[i][j]+ Math.min(dia, Math.min(right, down));
		return Ans;
		
		
	}

	public static void main(String[] args) {
		
		int [][]input = {{3, 4, 1, 2},{2, 1, 8, 9},{4, 7, 8, 1}};
//		minCostPath(input);
		System.out.println(minCostPath(input));

	}

}
