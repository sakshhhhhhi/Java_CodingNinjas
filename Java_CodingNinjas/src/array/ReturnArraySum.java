package array;

import java.util.Scanner;

class ReturnArraySum {
	public static int sum(int array[]) {
		int s =0;
		for(int i =0;i<array.length;i++){
			 s += array[i];
	}
		return s;
		
	}


	public static void main(String[] args) {
		
         // input is taken for array of length 5
		int[]arr= new int[5];
	    Scanner sc = new Scanner(System.in);
	    for(int i =0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println(sum(arr));
	    
        }
}
