package data_structures_in_Java.DynamicProgramming;

public class MinStepsToOne {
	public static int countMinStepsToOne(int n) {
		//Your code goes here
		if(n<=1) {
			return 0;
		}
		if(n==2||n==3) {
			return 1;
		}
		int ans1 = countMinStepsToOne(n-1);
		int ans2 = Integer.MAX_VALUE;
		int ans3 = Integer.MAX_VALUE;
		
		if(n%2==0) {
			ans2 =countMinStepsToOne(n/2);
		}
		if(n%3==0) {
			ans3 =countMinStepsToOne(n/3);
		}
		return Math.min(Math.min(ans2, ans3), ans1)+1;

	}

	public static void main(String[] args) {
		System.out.println(countMinStepsToOne(9));

	}

}
