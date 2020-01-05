package com.Array.prac;
//the element is called peak element if it is greater than its neighbours;
public class FindPeakElement {
	public static void main(String[] args) {
		int ar[]= {10,20, 15, 2, 23, 90, 67};
		int val=findPeak(ar);
		System.out.println(val);
	}

	private static int findPeak(int[] ar) {
		int start=0;int end=ar.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(start+1==end)
				return Math.max(ar[start],ar[end]);
			if(ar[mid]>ar[mid+1]&&ar[mid]>ar[mid-1])
				return ar[mid];
			else if(ar[mid-1]>ar[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	
}
