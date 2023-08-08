package data_structures_in_Java.DynamicProgramming1;

public class MinimumNumberOfSquares {
	public static int minCount(int n) {
		if(n==0) {
			return 0;
		}
		int minAns = Integer.MAX_VALUE;
		for(int i =1;i*i<=n;i++) {
			int currAns = minCount(n-(i*i));
			if(minAns>currAns) {
				minAns = currAns; 
			}
		}
		int Ans =1+minAns;
		return Ans;
	}
	public static void main(String[] args) {
		System.out.println(minCount(41));
	}

}
