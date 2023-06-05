package array2;

import java.util.Scanner;

public class Sort012 {
	public static void sort012(int[] arr) {
		int z=0,o=0,t=0,i;
		//counting zeros ones twos
		for( i =0;i<arr.length;i++) {
			if(arr[i]==0) {
				z++;
			}
			else if(arr[i]==1) {
				o++;
			}
			else if(arr[i]==2) {
				t++;
			}
			
		}
		i=0;
		while(z>0) {
			arr[i]=0;
			z--;
			i++;
		}
		while(o>0) {
			arr[i]=1;
			o--;
			i++;
		}
		while(t>0) {
			arr[i]=2;
			t--;
			i++;
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
		sort012(arr);
		printArray(arr);


	}

}
