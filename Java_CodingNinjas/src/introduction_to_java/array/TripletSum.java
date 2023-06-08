package introduction_to_java.array;

import java.util.Scanner;

public class TripletSum {
	public static int findTriplet(int[] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length-2;i++) {
			for( int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}
				
			}
		}
		return count;
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
		int arr[]=InputArray();
		System.out.print(findTriplet(arr , 12));


	}

}
