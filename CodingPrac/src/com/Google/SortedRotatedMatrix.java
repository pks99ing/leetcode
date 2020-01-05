package com.Google;
//find element in sorted rotated matrix
public class SortedRotatedMatrix {

	public static void main(String[] args) {
		int ar[]= {4,5,6,7,8,1,2,3};
		int target=8;
		int index=search(ar,target);
		System.out.println(index);
	}

	private static int search(int[] ar, int target) {
		int first=0;int last=ar.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(ar[mid]==target)
				return mid;
			else if(ar[mid]>=ar[first]) {
				if(target<ar[mid]&&target>=ar[first])
					last=mid-1;
				else
					first=mid+1;
			}
			else if(ar[mid]<ar[first]) {
				if(target>ar[mid]&&target<=ar[last])
					first=mid+1;
				else
					last=mid-1;
			}
		}
		return -1;
	}

}
