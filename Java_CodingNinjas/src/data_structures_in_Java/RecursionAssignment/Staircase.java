package data_structures_in_Java.RecursionAssignment;

public class Staircase {
    public static int staircase(int n){

	 if(n<0)
           return 0;
       if(n==0)
           return 1;
       int op1=staircase(n-1);
       int op2=staircase(n-2);
       int op3=staircase(n-3);
       return op1+op2+op3;

	}

	public static void main(String[] args) {
		System.out.println(staircase(4));

	}

}
