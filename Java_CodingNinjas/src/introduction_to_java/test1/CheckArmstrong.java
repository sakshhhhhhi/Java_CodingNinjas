package introduction_to_java.test1;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a,b,rem,f,sum=0,n=0, i;
	int c = sc.nextInt();
	a=c;
	b=c;
	//counting digits
	while(c>0) {
		c=c/10;
		n++;
	}
	while(a>0) {
		f=1;
		rem=a%10;
		for( i=1;i<=n;i++) {
			f=f*rem;
		}
		sum=sum+f;
		a=a/10;
		}
		if(b==sum) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	

	}

