package com.Array.prac;
//fixedpoint is the point that has same value as that of index
public class FixedPoint {

	public static void main(String[] args) {
		int ar[]= {-3,-4,-1,0,2,3,4,7,12,14};
		int index=findFixedPoint(ar);
		System.out.println(index);
	}

	private static int findFixedPoint(int[] ar) {
		int start=0;int end=ar.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(ar[mid]==mid)
				return mid;
			else if(ar[mid]>mid)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
}
