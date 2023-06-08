package introduction_to_java.BasicsofJava;
import java.util.*;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int basic = sc.nextInt();
		char c = sc.next().charAt(0);
		double totalSalary,allow,hra,da,pf;
		 
		if(c=='A') {
			 allow=1700;
		}
		else if(c=='B') {
			 allow=1500;
		}
		else{
			 allow=1300;
		}
		hra=0.20*basic;
		da=0.50*basic;
		pf=0.11*basic;
		totalSalary=basic+hra+da+allow-pf;
		double p =Math.round(totalSalary);
		int h =(int)(p);
		System.out.println(h);

	}

}
