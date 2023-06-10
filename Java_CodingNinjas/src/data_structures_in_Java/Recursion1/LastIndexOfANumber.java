package data_structures_in_Java.Recursion1;

public class LastIndexOfANumber {
	public static int lastIndex(int[]input,int x) {
		if(input.length==0) {
			return -1;
		}
		int[]smaller=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smaller[i-1]=input[i];
		}
		int lastIndex=lastIndex(smaller,x);
		if(lastIndex!=-1) {
			return lastIndex+1;
		}
		else {
			if(input[0]==x) {
				return 0;
			}
			else
				return -1;
		}
	}

	public static void main(String[] args) {
		int[]a= {3,5,6,4,5};
		System.out.println(lastIndex(a,5));

	}

}
