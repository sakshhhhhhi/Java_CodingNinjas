package introduction_to_java.Test2;

import java.util.Scanner;

public class LeaderInArray {
	public static void leaders(int[] input) {
		int i=0;
		int j =0;
		for( i=0;i<input.length-1;i++) {
			for(j=i+1;j<input.length;j++) {
				if(input[i]<input[j]) {
					break;
				}
			}
			if(j==input.length) {
				System.out.print(input[i]+" ");
			}
		}
		System.out.print(input[input.length-1]);
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

		int []arr=InputArray();
		leaders(arr);

		

	}

}
