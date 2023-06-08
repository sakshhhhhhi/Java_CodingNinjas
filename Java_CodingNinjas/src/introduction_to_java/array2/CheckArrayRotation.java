package introduction_to_java.array2;

import java.util.Scanner;

public class CheckArrayRotation {
	public static int arrayRotateCheck(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				return (i+1);
			}
		}
		return -1;
	}
	
	public static int[] InputArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		 for(int i =0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
		 return arr;
}

	public static void main(String[] args) {
		int[]arr=InputArray();
		System.out.println(arrayRotateCheck(arr));
		

	}

}
