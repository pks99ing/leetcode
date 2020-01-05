package com.Google;
//Find The missing and duplicate element and an array 
//n*(n+1)/2--sumofN;;;;(n*(n+1)*(2*n+1))/6--sumofN^2;;;

public class MissingAndDuplicateElement {
	public static void main(String[] args) {
		int ar[]= {1,2,3,3,5};
		missingAndDuplicate(ar);
	}

	private static void missingAndDuplicate(int[] ar) {
		int max=ar.length;
		int sumOfN=(max*(max+1))/2;
		int sumOfNSq=(max*(max+1)*(2*max+1))/6;

		for(int i:ar) {
			sumOfN-=i;
			sumOfNSq-=(i*i);
		}
		int missingNumber=(sumOfN+sumOfNSq/sumOfN)/2;
		System.out.println(missingNumber);
		//repeatingNumber
		System.out.println(missingNumber-sumOfN);
		
	}
	
}
