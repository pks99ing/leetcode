package com.Array.prac;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,5,6,5,2,1,4,4,8};
		findDuplicate(arr);
	}

	private static void findDuplicate(int[] arr) {
		int res[];
		HashMap<Integer,Integer> freq=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!freq.containsKey(arr[i]))
				freq.put(arr[i],0);
			freq.put(arr[i], freq.get(arr[i])+1);
		}
		for(Map.Entry entry:freq.entrySet()) {
			if((Integer)entry.getValue()>1)
				System.out.println(entry.getKey());
		}
	}
	
}
