package data_structures_in_Java.DynamicProgramming1;

public class MinStepsTo1DP {


	private static int minSteps(int n) {
		// TODO Auto-generated method stub
		int [] dp=new int[n+1];
        dp[1]=0;

        for(int i=2;i<dp.length;i++)
        {
            int op1=Integer.MAX_VALUE;
            int op2=Integer.MAX_VALUE;
            int op3=Integer.MAX_VALUE;
            op1=dp[i-1];
            if(i%2==0)
                op2=dp[i/2];
            if(i%3==0)
                op3=dp[i/3];
            dp[i]=1+Math.min(Math.min(op1,op2),op3);
        }
        return dp[n];
	}

}
