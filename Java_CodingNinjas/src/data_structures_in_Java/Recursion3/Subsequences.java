package data_structures_in_Java.Recursion3;

public class Subsequences {
	public static String[] subsequenceWord(String word){
		
		if(word.length()==0) {
			String[] output = new String[1];
			output[0] ="";
			return output;
		}
		
		String [] smalleroutput = subsequenceWord(word.substring(1));
		String [] ans = new String[2*smalleroutput.length];
		for(int i =0;i<smalleroutput.length;i++) {
			ans[i]=smalleroutput[i];
		}
		for(int i=0;i<smalleroutput.length;i++) {
			ans[smalleroutput.length+i] =word.charAt(0)+smalleroutput[i];
			
		}
		return ans;
	}
	public static void main(String[] args) {
		String word ="abc";
		String [] output =subsequenceWord(word);
		for(String s :output) {
			System.out.println(s);
		}
	}

}
