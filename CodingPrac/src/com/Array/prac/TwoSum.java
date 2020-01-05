package com.Array.prac;

import java.util.HashMap;
import java.util.Hashtable;

public class TwoSum {

	public static void main(String[] args) {
		int ar[]= {1, 4, 45, 6, 10, -8};
		int total=16;
		usingHashTable(ar,total);
		
	}

	private static void usingHashTable(int[] ar,int total) {
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		int i=0;
		while(i<ar.length) {
			if(map.containsKey(total-ar[i])) {
				System.out.println(total-ar[i]+" "+ar[i]);
				break;
			}
			map.put(ar[i], i);
			i++;
		}
		
		
	}

}
