package com.Google;

import java.util.Arrays;

public class NextPermutaation {

	public static void main(String[] args) {
		int ar[]= {2,1,8,7,6,3};
		nextPermu(ar);
		for(int i:ar)
			System.out.println(i);
	}

	private static void nextPermu(int[] ar) {
		int i;
		for(i=ar.length-1;i>0;i--) {
			if(ar[i]>ar[i-1])
				break;
		}
		if(i==0)
			return;
		int j=ar.length-1;
		for(;j>i;j--) {
			if(ar[j]>ar[i-1])
				break;
		}
		int temp=ar[i-1];
		ar[i-1]=ar[j];
		ar[j]=temp;
		Arrays.sort(ar, i, ar.length);
	}
	

}
