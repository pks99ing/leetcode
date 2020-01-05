package com.Array.prac;
//find intersection and union in an sorted array
public class UnionAndIntersection {
	public static void main(String[] args) {
		int ar1[]= {1,3,4,5,7,9};
		int ar2[]= {2,3,4,9};
		//intersection(ar1,ar2);
		union(ar1,ar2);
	}

	private static void union(int[] ar1, int[] ar2) {
		int s1=0;
		int s2=0;
		while(s1<ar1.length&&s2<ar2.length){
			if(ar1[s1]!=ar2[s2]) {
				if(ar1[s1]<ar2[s2]) {
					System.out.println(ar1[s1]);
					s1++;
				}
				else {
					System.out.println(ar2[s2]);
					s2++;
				}
			}
			if(ar1[s1]==ar2[s2]){
				System.out.println(ar1[s1]);
				s1++;
				s2++;
			}
		}
	}

	private static void intersection(int[] ar1, int[] ar2) {
		int s1=0;
		int s2=0;
		while(s1<ar1.length&&s2<ar2.length){
			if(ar1[s1]==ar2[s2]) {
				System.out.println(ar1[s1]);
				s1++;
				s2++;
			}
			else if(ar1[s1]>ar2[s2])
				s2++;
			else
				s1++;
		}
	}
	
}
