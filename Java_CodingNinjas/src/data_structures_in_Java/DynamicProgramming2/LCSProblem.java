package data_structures_in_Java.DynamicProgramming2;

public class LCSProblem {
	public static int lcshelper(String s, String t, int i , int j,int[][]dp){
		if(i==s.length()||j==t.length()) {
			return 0;
		}
		int ans =0;
		if(s.charAt(i)==t.charAt(j)){
			int smallans =0;
			if(dp[i+1][j+1]==-1) {
			smallans =lcshelper(s, t,i+1,j+1,dp);
			dp[i+1][j+1]=ans;
			}
			else {
				dp[i+1][j+1]=smallans;
			}
			ans = 1+ smallans;
			
			}
			
		
		else{
			int ans2 = lcshelper(s, t, i+1, j,dp);
			int ans3 = lcshelper(s, t, i, j+1,dp);
			ans =Math.max(ans2, ans3);
		}
		return ans;
	}

	public static int lcs(String s, String t,int[][]dp) {
		return lcshelper(s,t,0,0,dp);
    }
	public static void main(String[] args) {
		String str1="adebc";
		String str2 ="dcadb";
		int[][]dp =new int[str1.length()][str2.length()];
		for(int i =0;i<dp.length;i++) {
			for(int j =0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(lcs(str1,str2,dp));
	}

}
