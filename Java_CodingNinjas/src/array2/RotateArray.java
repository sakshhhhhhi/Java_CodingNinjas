package array2;

import java.util.Scanner;

public class RotateArray {
	public static void rotate(int[] arr, int d) {
    	//Your code goes here        
        int[] temp=new int[d];
        for (int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for (int i=0,j=0;i<arr.length && j<d;i++)
        {
            if (i<arr.length-d)
            {
                arr[i]=arr[i+d];
            }
            else
            {
                arr[i]=temp[j];
                j++;
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
		rotate(arr,2);
		printArray(arr);


	}

}
