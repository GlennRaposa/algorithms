package com.binarysearch;

public class BinaryRotationCount {
	
	public static void main(String args[]){
		int[] a  = {11,12,15,18,2,5,6,8};
		int rotationNumber = findRotationCount(a, a.length-1);
		System.out.println("ROTATIONS ::"+rotationNumber);
	}
	
	public static int findRotationCount(int a[], int length){
		int low = 0;
		int high = length-1;
		
		while(low <=high){
			
			int mid = (low+high) / 2;
			if(a[low] <=a[high]){
				return low;
			}
			int next = (mid+1)%length;
			int prev = (mid+length-1)%length;
			
			if(a[mid] <= a[next] && a[mid] <= a[prev]){
				return mid;
			}
			else if(a[mid] <=a[high]){
				high = mid -1;
			}else if (a[mid] >=a[low]){
				low = mid+1;
			}
		}
		return -1;
	}

}
