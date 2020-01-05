package com.Array.prac;

import java.util.HashMap;

//find zero sum problem
public class ZeroSum {

	public static void main(String[] args) {
		int ar[]= {-3, 2, 3, 1, 6};
		int pre[]=makePrefix(ar);
		findSubArray(ar,pre);
	}

	private static void findSubArray(int[] ar, int[] pre) {
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		int start=-1;
		int i=0;
		for(;i<pre.length;i++) {
			if(map.containsKey(pre[i])) {
				start=map.get(pre[i]);
				break;
			}
			map.put(pre[i],i);
		}
		if(start>-1)
			for(int j=start+1;j<=i;j++) {
				System.out.println(ar[j]);
			}
		else
			System.out.println("There is no subarray with zero sum");
		
	}

	private static int[] makePrefix(int[] ar) {
		int pre[]=new int[ar.length];
		pre[0]=ar[0];
		for(int i=1;i<ar.length;i++) {
			pre[i]=pre[i-1]+ar[i];
		}
		return pre;
	}

}
