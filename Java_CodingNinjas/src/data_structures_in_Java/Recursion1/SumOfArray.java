package data_structures_in_Java.Recursion1;

public class SumOfArray {
	public static int sum(int input[]) {
		if(input.length==1) {
			return input[0];
		}
		int[] smallerOutput=new int [input.length-1];
		for(int i=1;i<input.length;i++) {
			smallerOutput[i-1]=input[i];
		}
		int total=sum(smallerOutput);
		total+=input[0];
		return total;
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(sum(a));

	}

}
