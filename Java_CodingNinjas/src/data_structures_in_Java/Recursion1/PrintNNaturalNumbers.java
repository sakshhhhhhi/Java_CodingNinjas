package data_structures_in_Java.Recursion1;

public class PrintNNaturalNumbers {
	public static void print(int n ) {
		if(n==0) {
			return;
		}
		print(n-1);
	    System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		print(5);

	}

}
