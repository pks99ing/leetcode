package com.Array.prac;
//Find a missing from 1 to n  
public class MissingNumber {
	public static void main(String[] args) {
		int arr[]= {1,6,4,5,9,8,3,2};
		int res=findMissingNo(arr);
		System.out.println(res);
	}

	private static int findMissingNo(int[] arr) {
		int n=arr.length+1;
		int exp=n*(n+1)/2;
		int act=0;
		for(int i=0;i<arr.length;i++) {
			act+=arr[i];
		}
		return exp-act;
	}
	
}
