package introduction_to_java.array;

import java.util.Scanner;

public class FindUnique {
	
	public static int solution(int []arr){
		
		for(int i =0;i<arr.length;i++) {
			int j ;
			for( j =1;j<arr.length;j++) {
				if(i!=j) {
				if (arr[i]==(arr[j])) {
					break;
				}
			  }
			}
		    if(j==arr.length) {
			return arr[i];
		}
		}
		return 0;
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
		System.out.println(solution(arr));
//		printArray(solution(arr));

	}

}
