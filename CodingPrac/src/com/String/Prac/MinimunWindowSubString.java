package com.String.Prac;

public class MinimunWindowSubString {

	public static void main(String[] args) {
		String str="AB0BAOCDEBAC";
		String test="ABC";
		int maxValue=Integer.MAX_VALUE;
		String res="";
		int count[]=new int[128];
		for(char c:test.toCharArray())
			count[c]=count[c]+1;
		
		int start,end,c;
		start=0;c=0;
		for(end=0;end<str.length();end++) {
			if(--count[str.charAt(end)]>=0)
				c++;
			while(c==test.length()) {
				if(maxValue>end-start+1) {
					maxValue=end-start+1;
					res=str.substring(start,end+1);
				}
				if(++count[str.charAt(start)]>0) {
					c--;
				}
				start++;
			}
			
		}
		System.out.println(res);
	}

}
