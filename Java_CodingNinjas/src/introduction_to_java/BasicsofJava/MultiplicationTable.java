package introduction_to_java.BasicsofJava;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(n*i);
			i++;
		}
		

	}

}
