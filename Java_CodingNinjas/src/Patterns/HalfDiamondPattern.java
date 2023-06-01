package Patterns;
import java.util.*;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*");


        // Print upper half of the pattern
        int i = 1;
        while (i <= n) {
        	System.out.print("*");
            int p = 1;
            while (p <= i) {
            	System.out.print(p);
            	p++;
            	}
            int j=1;
            while(j<i) {
            	System.out.print(i-j);
            	j++;
            }
            System.out.println("*");
            i++;
            }
       //Print lower half of the pattern  
         
        int u =1;
        while(u<n) {
        	System.out.print("*");
        	int t =1;
        	while(t<=n-u) {
        		System.out.print(t);
        		t++;
        	}
        	int v=1;
        	while(v<n-u) {
        		System.out.print(n-v-u);
        		v++;
        	}
        	System.out.println("*");
        	u++;
        }
        System.out.print("*");
	

	}
}
