package introduction_to_java.Test2;

import java.util.Scanner;

public class Print2DArray {
	public static void print2DArray(int input[][]) {
		int n= input.length;
        int m= input[0].length;
        
         for(int i=1;i<=n;i++){
			 for (int j=n-i+1;j>=1;j--){
				 for(int a=0;a<m;a++){
                System.out.print(input[i-1][a]+" ");
            }
            System.out.println();
        }
    
    }

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r= sc.nextInt();
		int c=sc.nextInt();
		int [][]arr= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j =0;j<c;j++) {
				arr[i][j]=sc.nextInt();
				}
		}
		print2DArray(arr);

	}

}
