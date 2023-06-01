package operatorsAndForLoop;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        int no=1,count=0;
        while(count<n)
        {
            j=3*no+2;
            if(j%4!=0)
            {
                System.out.print(j+" ");
                count++;
            }
        no++;
        }
	}

}
