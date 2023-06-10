package data_structures_in_Java.Recursion1;

public class CalculatePower {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput=power( x, n-1) ;
		int Output=x*smallOutput;
			return Output;
		
	}

	public static void main(String[] args) {
		System.out.println(power(5,3));

	}

}
