package data_structures_in_Java.RecursionAssignment;

public class SumOfDigits {
	public static int sum(int n ) {
		if(n==0) {
			return 0;
		}
		return n%10+sum(n/10);
	}

	public static void main(String[] args) {
		System.out.println(sum(234));

	}

}
