package introduction_to_java.array;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void swapalternate(int[]arr) {
		for(int i =0;i<arr.length-1;i+=2) {
			int temp =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
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
	
	
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int[]arr=InputArray();
		swapalternate(arr);
		printArray(arr);
	
	   
	}

}
