package com.Google;

import java.util.Arrays;

public class LongestIncresingSubsequenceArray {

	public static void main(String[] args) {
		int nums[]= {10,9,2,5,3,7,101,18};
		int dp[]=new int[nums.length];
	       Arrays.fill(dp,1);
	       int max=1;
	        for(int i=1;i<nums.length;i++){
	            for(int j=i-1;j>=0;j--){
	                if(nums[i]>nums[j]){
	                    dp[i]=Math.max(dp[i],dp[j]+1);
	                    if(dp[i]>max)
	                        max=dp[i];
	                }
	                    
	            }
	        }
	       System.out.println(max);
	}

}
