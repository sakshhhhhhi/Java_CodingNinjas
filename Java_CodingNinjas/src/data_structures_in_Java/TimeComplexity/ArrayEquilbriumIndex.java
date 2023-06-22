package data_structures_in_Java.TimeComplexity;

public class ArrayEquilbriumIndex {
	public static int arrayindex(int[]arr) {
		int i,j,rightSum,leftSum;
		for(i=0;i<arr.length;i++) {
			
			leftSum=0;
			for(j=0;j<i;j++) {
				leftSum+=arr[j];
			}
			
			rightSum=0;
			for(j=i+1;j<arr.length;j++) {
				rightSum+=arr[j];
			}
			if(leftSum==rightSum) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[]arr1= {1,4,9,3,2};

		System.out.print(arrayindex(arr1));

	}
}