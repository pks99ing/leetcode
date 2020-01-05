package com.Array.prac;

public class RotateImage {

	public static void main(String[] args) {
		int ar[][]= {{1,2,3,6},
				{4,5,6,4},{7,8,9,1}	,{10,11,12,5}};
		maketranspose(ar);
		callReverse(ar);
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[0].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static void callReverse(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			int start=0;int end=ar.length-1;
			while(start<end) {
				int x=ar[i][start];
				int y=ar[i][end];
				ar[i][start]=y;
				ar[i][end]=x;
				start++;
				end--;
			}
		}
		
	}

	private static void maketranspose(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i;j<ar[0].length;j++) {
				if(i!=j) {
					int x=ar[i][j];
					int y=ar[j][i];
					ar[i][j]=y;
					ar[j][i]=x;
				}		
			}
		}
	}
	

}
