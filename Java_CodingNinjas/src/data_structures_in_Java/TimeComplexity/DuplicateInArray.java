package data_structures_in_Java.TimeComplexity;

public class DuplicateInArray {
	public static int findDuplicates(int[]arr) {
		int n=arr.length;
		int exp_sum=((n-1)*(n-2))/2;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum-exp_sum;
		
	}

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,3};
		System.out.println(findDuplicates(arr));

	}

}
