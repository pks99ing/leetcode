package com.Array.prac;

public class FLarAndSecLarge {

	public static void main(String[] args) {
		int arr[]= {12, 35, 1, 10, 34, 1};
		finder(arr);
	}

	private static void finder(int[] arr) {
		int max=arr[0];
		int sMax=-99;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				sMax=max;
				max=arr[i];
			}
			else if(arr[i]!=max&&arr[i]>sMax)
				sMax=arr[i];
				
		}
		System.out.println(sMax+"  "+max);
	}

}
