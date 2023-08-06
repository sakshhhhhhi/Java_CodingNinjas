package data_structures_in_Java.Recursion3;

public class factorial {
	public static void factorial2(int n , int answer) {
		if(n==0) {
			System.out.println(answer);
			return;
		}
		answer =answer*n;
		factorial2(n-1,answer);
	}

	public static void main(String[] args) {
		factorial2(5,1);

	}

}
