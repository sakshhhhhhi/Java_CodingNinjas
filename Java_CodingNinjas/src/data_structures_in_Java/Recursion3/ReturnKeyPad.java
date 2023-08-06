package data_structures_in_Java.Recursion3;

public class ReturnKeyPad {
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
	public static String[] keypad(int n){
		if(n==0||n==1) {
			String[] out = new String[1];
			out[0] ="";
			return out;
		}
		String[] smallerOutput = keypad(n/10);
		int last = n%10;
		String lastOptions = getOptions(last);
		String[] output = new String[smallerOutput.length*lastOptions.length()];
		int k =0;
		for(int i =0;i<smallerOutput.length;i++) {
			for(int j =0;j<lastOptions.length();j++) {
				output[k] = smallerOutput[i]+lastOptions.charAt(j);
				k++;
			}
		}
		return output;

	}

}
