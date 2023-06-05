package array2;

import java.util.Scanner;

public class SecondLargestInArray {
	public static int secondLargest(int[]arr) {
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		 if (arr.length<=1)
	        {
	            return second;
	        }
	        else
	        {
	            boolean flag=true;
	            for (int i=1;i<arr.length;i++)
	            {
	                if (arr[0]!=arr[i])
	                {
	                    flag=false;
	                    break;
	                }
	            }
	            
	            if (flag==true)
	            {
	                return second;
	            }
	            else
	            {
	                for (int i=0;i<arr.length;i++)
	                {
	                    if (arr[i]>first)
	                    {
	                        second=first;
	                        first=arr[i];
	                    }
	                    else if (arr[i]>second && arr[i] != first)
	                    {
	                        second=arr[i];
	                    }
	                }
	            }
	            return second;
	        }
	}
	public static int[] InputArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		 for(int i =0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
		 return arr;
}


	public static void main(String[] args) {
		int []arr=InputArray();
		System.out.print(secondLargest(arr));
		

	}

}
