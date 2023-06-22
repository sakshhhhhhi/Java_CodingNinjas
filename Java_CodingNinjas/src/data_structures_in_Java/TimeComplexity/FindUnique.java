package data_structures_in_Java.TimeComplexity;

public class FindUnique {
	
	public static int Unique(int [] arr){
		int ans =arr[0];
		for(int i=1;i<arr.length;i++) {
			//XOR operation cancels out duplicates and only unique remains
			ans=ans^arr[i];
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,3,2,1};
		System.out.println(Unique(arr));

	}

}
