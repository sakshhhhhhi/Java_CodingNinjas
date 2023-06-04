package array;

import java.util.Scanner;

public class IntersectionOfTwoArrays {
	public static void intersections(int arr1[],int arr2[]) {
		for(int i =0;i<arr1.length;i++) {
			for(int j =0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]+ " ");
					arr2[j]=Integer.MIN_VALUE;
					break;
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
		int arr1[]=InputArray();
		int arr2[]=InputArray();
		intersections(arr1,arr2);

	}

}
