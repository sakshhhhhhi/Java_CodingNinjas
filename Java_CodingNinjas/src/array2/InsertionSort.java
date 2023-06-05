package array2;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[]arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
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
		insertionSort(arr);
		printArray(arr);

	}

}
