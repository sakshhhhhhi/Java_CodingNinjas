package array2;

import java.util.Scanner;

public class MergeTwoSortedArray {
	
	public static int[]merge(int arr1[],int arr2[]){
		int n=arr1.length;
		int m =arr2.length;
		int[]arr3= new int[m+n];
		int i=0,j=0;
		int k =0;
		while(i<n&&j<m) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}	
		}
		while(i<n) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}	
		return arr3;
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
		int arr1[]=InputArray();
		int arr2[]=InputArray();
		printArray(merge(arr1,arr2));

	}

}
