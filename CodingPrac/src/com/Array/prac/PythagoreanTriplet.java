package com.Array.prac;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int ar[]= { 10, 4, 6, 12, 5};
		boolean res=isPossible(ar);
		System.out.println(res);
	}

	private static boolean isPossible(int[] ar) {
		for (int i = 0; i < ar.length; i++) 
            ar[i] = ar[i] * ar[i];
		Arrays.sort(ar);
		int i,end;
		for(int start=0;start<=ar.length-2;start++) {
			i=start+1;
			end=ar.length-1;
			while(i<end) {
				if(ar[start]+ar[i]==ar[end]) {
					return true;
				}
				else if(ar[start]+ar[i]>ar[end]) {
					i++;
				}
				else
					end--;
				
			}
			
		}
		return false;
	}

}
