package data_structures_in_Java.Test1;

public class Doesstringscontainstring {
	
	public static boolean checkSequence(String a, String b) {
		if(b.length()==0) {
			return true;
		}
		if(a.length()==0) {
			return false;
		}
		if(a.charAt(0)==b.charAt(0)) {
			a= a.substring(1);
			b= b.substring(1);
		}
		else {
			a= a.substring(1);
		}
		boolean ans =checkSequence(a,b);
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(checkSequence("abcde","aeb"));

	}

}
