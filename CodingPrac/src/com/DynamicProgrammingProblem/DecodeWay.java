package com.DynamicProgrammingProblem;
// complete solution                           ****Asked by Facebook******
public class DecodeWay {
	static int l,r,sum;
	public static void main(String[] args) {
		String s="101";
		int res=decodeWays(s);
		System.out.println(res);
	}
	 public static int decodeWays(String s){
		 if(s.length()==0||s.charAt(0)=='0')
	            return 0;
	         int dp[]=new int[s.length()+1];
			 dp[0]=1;
	        dp[1]=1;
			 for(int i=2;i<=s.length();i++) {
				int first=Integer.parseInt(s.substring(i-1,i));
	             if(first!=0)
	                dp[i]+=dp[i-1];
	            int second=Integer.parseInt(s.substring(i-2,i));
	             if(second>=10&&second<=26)
	                 dp[i]+=dp[i-2];
			 }
				return dp[s.length()]; 
	 }
}
