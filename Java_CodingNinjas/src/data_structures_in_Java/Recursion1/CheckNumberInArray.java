package data_structures_in_Java.Recursion1;

public class CheckNumberInArray {
	public static boolean checkNumber(int input[],int x) {
		if(input.length==1) {
			if(input[0]==x) {
				return true;
			}
			else {
			return false;
			}
		}
		if(input[0]==x) {
			return true;
		}
		int[] SmallerOutput=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			SmallerOutput[i-1]=input[i];
		}
		boolean check=checkNumber(SmallerOutput,x);
		return check;
	}

	public static void main(String[] args) {
		int[]a= {1,2,3,4,6};
		System.out.println(checkNumber(a,5));

	}

}
