package introduction_to_java.array2;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[]arr) {
		int n =arr.length;
		for(int i =0;i<n-1;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
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
		bubbleSort(arr);
		printArray(arr);

	}

}
