package introduction_to_java.array2;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[]arr, int x) {
		int n =arr.length;
		int e=n-1;
		int s=0;
		while(s<=e) {
			int m=(e+s)/2;
			if(arr[m]==x) {
				return m;
			}
			else if(arr[m]>x) {
				e=m-1;
			}
			else if(arr[m]<x) {
				s=m+1;
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
		int arr[]=InputArray();
		System.out.println(binarySearch(arr,3));

	}

}
