package data_structures_in_Java.TimeComplexity;

public class PairSumInArray {
	public static int pairsum(int [] arr,int num) {
		int count=0;
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					count++;
				}
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		int [] arr= {2,8,10,5,-2,5};
		System.out.print(pairsum(arr,10));
		

	}

}
