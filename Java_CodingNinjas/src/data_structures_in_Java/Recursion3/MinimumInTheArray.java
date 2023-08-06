package data_structures_in_Java.Recursion3;

public class MinimumInTheArray {

	public static void printMin(int[] arr, int si, int minValue) {
		if(si==arr.length) {
			System.out.println(minValue);
			return;
		}
		int minimum =minValue; 
		if(arr[si]<minValue) {
			minimum =arr[si];
		}
		printMin(arr,si+1,minimum);
	}
	public static void main(String[] args) {
		int[] arr = {23,32,2,34,34,332,42,24};
		printMin(arr,0,Integer.MAX_VALUE);

	}

}
