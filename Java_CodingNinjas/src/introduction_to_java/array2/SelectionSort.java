package introduction_to_java.array2;

import java.util.Scanner;

public class SelectionSort {
	
	public static  void selectionSort(int[]arr) {
		int n =arr.length; 
		int i;

		for(  i =0;i<n-1;i++) {
				@SuppressWarnings("unused")
				int min =Integer.MAX_VALUE;
				int minIndex=i;
				for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					min=arr[j];
					minIndex=j;		
				}
			}		
				int temp;
				temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;  
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
		int arr[]=InputArray();
		selectionSort(arr);
		printArray(arr);
	}

}
