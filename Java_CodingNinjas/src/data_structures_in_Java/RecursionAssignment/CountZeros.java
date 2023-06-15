package data_structures_in_Java.RecursionAssignment;

public class CountZeros {
	public static int count(int n ) {
		if(n<10) {
			if(n==0) 
				return 1;
			else
				return 0;
		}
		int smallAns=count(n/10);
		if(n%10==0) {
			smallAns=smallAns+1;
		}
		return smallAns;
	}

	public static void main(String[] args) {
		System.out.println(count(1230005));

	}

}
