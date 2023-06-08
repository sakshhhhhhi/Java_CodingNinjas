package introduction_to_java.array;

import java.util.Scanner;

public class LinearSearch {
	public static int linearsearch(int array[],int n) {

		for(int i =0;i<array.length;i++) {
			if(array[i]==n) {
				return i;			
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[]arr= new int[5];
	    Scanner sc = new Scanner(System.in);
	    for(int i =0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println(linearsearch(arr, 4));
	    

	}

}
