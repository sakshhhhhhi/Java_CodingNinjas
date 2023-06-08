package introduction_to_java.BasicsofJava;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		while(i<=n/2) {
		     if(n%i==0) {
			System.out.print(i+" ");
		}
		i=i+1;
	}
}
}
