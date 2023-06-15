package data_structures_in_Java.RecursionAssignment;

public class Multiplication {
	public static int multiply(int m, int n ) {
		if(n==0) {
			return 0;
		}
		return m+multiply(m,n-1);
	}

	public static void main(String[] args) {
		System.out.println(multiply(4,0));

	}

}
