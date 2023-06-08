package introduction_to_java.array;

import java.util.Scanner;

public class Sort01 {
	public static void sortZerosAndOne(int[]arr) {
		int nextZero = 0;
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero += 1;
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
		sortZerosAndOne(arr1);
		printArray(arr1);
		
	}

}
