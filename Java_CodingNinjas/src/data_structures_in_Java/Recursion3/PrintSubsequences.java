package data_structures_in_Java.Recursion3;

public class PrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="abc";
		printsubsequence(input,"");

	}

	private static void printsubsequence(String input, String stringSoFar) {
		if(input.length()==0) {
			System.out.println(stringSoFar);
			return;
		}
		String small = input.substring(1);
		printsubsequence(small,stringSoFar);
		printsubsequence(small,stringSoFar+input.charAt(0));
		
	}

}
