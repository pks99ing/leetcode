package com.String.Prac;

import java.util.Collections;
import java.util.HashMap;

public class LongSubStrWithKDistinct {
	public static void main(String[] args) {
		String str="aaabb";
		int start=0;
		int end;
		int max=0;
		int ref;
		int count=0;
		int k=1;
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(end=0;end<str.length();end++) {
			if(!map.containsKey(str.charAt(end)))
				count++;
			map.put(str.charAt(end), end);
			
			if(count>k) {
				start=Collections.min(map.values())+1;
				end=start-1;
				map.clear();
				count=0;
			}
			if(count<=k) {
				max=Math.max(max, end-start+1);
				System.out.println(start+ " "+end);
			}
		}
		System.out.println(max);
	}
}
