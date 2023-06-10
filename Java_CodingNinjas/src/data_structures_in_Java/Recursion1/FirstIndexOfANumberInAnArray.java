package data_structures_in_Java.Recursion1;

public class FirstIndexOfANumberInAnArray {
	public static int firstNumber(int[]input,int x) {
		if(input.length==0) {
			return -1;
		}
		if(input[0]==x) {
			return 0;
		}
		int[]smaller=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smaller[i-1]=input[i];
		}
		int index=firstNumber(smaller,x);
		if(index==-1) {
			return -1;
		}
		return index+1;
	}

	public static void main(String[] args) {
		int[]a= {3,5,6,4,5};
		System.out.println(firstNumber(a,5));

	}

}
