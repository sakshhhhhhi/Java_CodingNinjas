package array2;

import java.util.Scanner;

public class PushZerosToEnd {
	public static void pushZerosAtEnd(int[]arr) {
		int n =arr.length;
		int i,j;
		for(i=0,j=0;j<n;j++) {
			if(arr[j]!=0) {
				arr[i]=arr[j];
				i++;
			}
		}
		for(int k=i;k<n;k++) {
			arr[k]=0;
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
		pushZerosAtEnd(arr);
		printArray(arr);


	}

}
