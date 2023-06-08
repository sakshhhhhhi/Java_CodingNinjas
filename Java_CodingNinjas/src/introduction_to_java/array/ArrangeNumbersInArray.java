package introduction_to_java.array;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	public static void solution(int[]arr,int a){
		for(int i=0;i<a;i++) {
			arr[i]=a;
		}
		for(int i=0;i<a/2;i++) {
			arr[i]=2*i+1;
			arr[a-1-i]=2*i+2;
		}
		return;
	}
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[]arr= new int[n];
		n=arr.length;
		solution(arr,n);
	    printArray(arr);

	}

}
