package BasicsofJava;
import java.util.*;
public class SumofEvenandOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m =N;
		int s,o=0,e=0;
		while(m>0) {
			s=m%10;
			m=m/10;
			if(s%2==0) {
				e=e+s;
			}
			if(s%2!=0) {
				o=o+s;
			}
		}
		System.out.print(e+" "+o);

	}

}
