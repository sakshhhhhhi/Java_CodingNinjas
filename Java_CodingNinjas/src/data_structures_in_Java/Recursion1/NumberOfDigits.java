package data_structures_in_Java.Recursion1;


public class NumberOfDigits {
   public static int count(int n) {
	   if(n/10==0) {
		   return 1;
	   }
	   return 1+count(n/10);
   }
	public static void main(String[] args) {
		System.out.println(count(1234));

	}

}
