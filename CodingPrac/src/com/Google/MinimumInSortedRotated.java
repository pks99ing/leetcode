package com.Google;

public class MinimumInSortedRotated {

	public static void main(String[] args) {
		int ar[]= {4,5,6,7,8,9,0,1,2};
		int val=minimum(ar);
		System.out.println(val);
	}

	private static int minimum(int[] nums) {
		int lo = 0, hi = nums.length-1;
        while (lo < hi) {
            int mid = (lo +hi)/2;
            if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return nums[lo];
		
	}
}
