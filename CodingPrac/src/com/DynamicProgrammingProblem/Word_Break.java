package com.DynamicProgrammingProblem;
//complete Solution ***                  Medium
//Dynamic programing one is best one
import java.util.ArrayList;

public class Word_Break {
	static boolean val=false;
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
	/*	list.add("cat");
		list.add("dog");
		list.add("sand");
		list.add("and");
		list.add("cat");*/
		/*list.add("car");
		list.add("ca");
		list.add("rs");*/
		 list.add("i");
		 list.add("like");
		 list.add("sam");
		 list.add("sung");
		 list.add("samsung");
		 list.add("mobile");
		 list.add("ice");
		 list.add("and");
		 list.add("cream");
		 list.add("icecream");
		 list.add("man");
		 list.add("go");
		 list.add("mango");
		String s ="samsungandmangok";
		long startTime = System.nanoTime();
		
		
	//	boolean res=findIt(s,list,0,0);
		boolean res=findIt(s,list);
		
		
		long endTime = System.nanoTime();
		
		System.out.println(res+"   "+(endTime-startTime));
	}
	private static boolean findIt(String s, ArrayList<String> list) {
		boolean dp[]=new boolean[s.length()+1];
		dp[0]=true;
		for(int i=1;i<=s.length();i++) {
			for(int j=0;j<i;j++) {
				if(dp[j]==true&&list.contains(s.substring(j,i))) {
					dp[i]=true;
					break;
				}
			}
		}	
		
		return dp[dp.length-1];
	}

	private static boolean findIt(String s, ArrayList<String> list,int i,int j) {
		
		if(j==s.length())
			return true;
		for(int k=j;k<s.length();k++) {
			if(list.contains(s.substring(i,k+1))) {
				val=findIt(s, list, k+1,k+1);
				if(j==s.length())
					return val;
			}
		}
		return val;
	}
	
}
