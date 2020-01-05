package com.Array.prac;

public class SpiralMatrix {

	public static void main(String[] args) {
	//	int ar[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int ar[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		spiral(ar);

	}

	private static void spiral(int[][] ar) {
		int rStart=0;int rEnd=ar.length-1;
		int cStart=0;int cEnd=ar[0].length-1;
		
		while(rStart<=rEnd&&cStart<=cEnd) {
			
			for(int i=cStart;i<=cEnd;i++) {
				System.out.println(ar[rStart][i]+" 1");
			}
			rStart++;
			for(int i=rStart;i<=rEnd;i++) {
				System.out.println(ar[i][cEnd]+" 2");
			}
			cEnd--;
			if(rStart<=rEnd&&cStart<=cEnd) {
			for(int i=cEnd;i>=cStart;i--) {
				System.out.println(ar[rEnd][i]+" 3");
				}
			rEnd--;
			
			
				for(int i=rEnd;i>=rStart;i--) {
					System.out.println(ar[i][cStart]+" 4");
				}
				cStart++;
			}
			
			
		}
		
	}

}
