package com.Array.prac;

public class MultipleMissingWithDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,3,1,9,8,9};
		int n=10;
		int reg[]=new int[n+1];
		for(int i:arr)
			reg[i]=1;
		for(int i=0;i<reg.length;i++) {
			if(reg[i]==0)
				System.out.println(i+ " ");
		}

	}

}
