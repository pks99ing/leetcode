package com.Array.prac;

public class MininumDistanceBetweenXandY {

	public static void main(String[] args) {
		int ar[]= {2, 5, 3, 5, 4, 4, 2, 3};
		int x=3;
		int y=2;
		int min=findMinDis(ar,x,y);
		System.out.println(min);
	}

	private static int findMinDis(int[] ar, int x, int y) {
		int iX=-1;
		int iY=-1;
		int i=0;
		String s="";
		int mindis=Integer.MAX_VALUE;
		while(i<ar.length) {
			if(ar[i]==x) {
				iX=i;
				break;
			}
			if(ar[i]==y) {
				iY=i;
				break;
			}
			i++;
		}
		int j=iX>-1?iX:iY;
		int k=j+1;
		for(;k<ar.length;k++) {
			if((ar[k]==x ||ar[k]==y)&&ar[k]!=ar[j]) {
				if(k-j<mindis) {
					mindis=k-j;
					s=k+" " +j;
				}
				j=k;
			}
			if(ar[k]==ar[j])
				j=k;
			
		}
		System.out.println(s);
		return mindis;
	}

}
