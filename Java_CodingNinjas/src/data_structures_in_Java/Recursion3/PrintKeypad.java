package data_structures_in_Java.Recursion3;

public class PrintKeypad {
	static String getOptions(int n ) {
		if(n==2) {
			return "abc";
		}
		if(n==3) {
			return "def";
		}
		if(n==4) {
			return "ghi";
		}
		if(n==5) {
			return "jkl";
		}
		if(n==6) {
			return "mno";
		}
		if(n==7) {
			return "pqrs";
		}
		if(n==8) {
			return "tuv";
		}
		if(n==9) {
			return "wxyz";
		}
		if(n==2) {
			return "abc";
		}
		if(n==2) {
			return "abc";
		}
		return "";
	}
	public static void printKeypad(int input,String stringSoFar) {
		if(input==0) {
			System.out.println(stringSoFar);
			return;
		}
		int lastdigit = input%10;
		int small = input/10;
		String lastDigitOption =getOptions(lastdigit);
		
		for(int i =0;i<lastDigitOption.length();i++) {
			printKeypad(small,lastDigitOption.charAt(i)+stringSoFar);
		}
	}

	public static void main(String[] args) {
		printKeypad(23,"");

	}

}
