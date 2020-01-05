package com.DynamicProgrammingProblem;

public class ClimbingStair {

	public static void main(String[] args) {
		int n=44;
		long startTime=System.nanoTime();
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		//int val=climbStairs(n,dp);
		int val=climbStairs(n);
		long endTime=System.nanoTime();
		System.out.println(val+"  "+(endTime-startTime));
	}
// Iterative approach
	private static int climbStairs(int n) {
		int a=1;
		int b=1;
		int c=0;
		for(int i=2;i<=n;i++) {
			 c=a+b;
			 a=b;
			 b=c;
		}
		return c;
	}

/* Dynamic programming approach
 * 
 * 	private static int climbStairs(int n,int dp[]) {
			if(dp[n]!=0)
				return dp[n];
			
	        dp[n-1]= climbStairs(n-1,dp);
	        dp[n-2]=climbStairs(n-2,dp);
	        return dp[n-1]+dp[n-2];
	}*/

}
