package com.Array.prac;
//Given an array find the first and last index,where from first
//to last if we sort the array all array will be sorted;
public class MaximumUnsortedArray {

	public static void main(String[] args) {
		
		int ar[]= {10,12,20,30,25,40,32,31,35,50,60};
		findIndex(ar);
	}

	private static void findIndex(int[] ar) {
		int start=0;int end=ar.length-1;
		while(start!=ar.length-2) {
			if(ar[start]>ar[start+1])
				break;
			start++;
		}
		while(end!=1) {
			if(ar[end]<ar[end-1])
				break;
			end--;
		}
		int max=findMax(ar,start,end);
		int min=findMin(ar,start,end);
		int rstart=findStart(ar,min,0,ar.length-1);
		int rend=findEnd(ar,max,0,ar.length-1);
		System.out.println(rstart+" "+rend);
	}

	private static int findEnd(int[] ar, int max, int start, int end) {
		int i=end;
		for(;i>=start;i--) {
			if(ar[i]<max)
				break;
		}
		return i;
	}

	private static int findStart(int[] ar,int min, int start, int end) {
		int i=start;
		for(;i<=end;i++) {
			if(ar[i]>min)
				break;
		}
		return i;
	}

	private static int findMin(int[] ar, int start, int end) {
		int min=ar[start];
		for(int i=start;i<=end;i++) {
			if(ar[i]<min)
				min=ar[i];
		}
		return min;
	}

	private static int findMax(int[] ar, int start, int end) {
		int max=ar[start];
		for(int i=start;i<=end;i++) {
			if(ar[i]>max)
				max=ar[i];
		}
		return max;
	}
	
	

}
