package array2;

import java.util.Scanner;

public class SumOfTwoArrays {
	public static void sumofTwoArrays(int []arr1,int []arr2,int []output) {
         int carry = 0,k,i,j;
			if(arr1.length > arr2.length) {
				 i = arr1.length - 1;
	             j = arr2.length - 1;
				 while(i >= 0 && j >= 0) {
						output[i + 1] = (arr1[i] + arr2[j] + carry) % 10;
						carry = (arr1[i] + arr2[j] + carry)/10;
						i--;
						j--;
			}
				 for(k = i+1;k > 0 && i >= 0;k--) {
					 output[k] = (arr1[i] + carry) % 10;
				     carry = (arr1[i] + carry) / 10;
	               i--;
				 } 
				 output[0] = carry;
			}
			else {
				 i = arr1.length - 1;
	             j = arr2.length - 1;
				 while(i >= 0 && j >= 0) {
						output[j + 1] = (arr1[i] + arr2[j] + carry) % 10;
						carry = (arr1[i] + arr2[j] + carry)/10;
						i--;
						j--;
			}
				 for(k = j+1;k > 0 && j >= 0;k--) {
					 output[k] = (arr2[j] + carry) % 10;
				     carry = (arr2[j] + carry) / 10;
	                 j--;
				 }
				 output[0] = carry;
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
		 int[] output = new int[Math.max(1+arr1.length, arr2.length)];
		sumofTwoArrays(arr1,arr2,output);


	}

}
