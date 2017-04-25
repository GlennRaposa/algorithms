package com.a.matrix.puzzels.question;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Input : {2,7,11,15};  target : 9
 * Output : {2,7}
 * 
 * consideration 
 * Is the array sorted ? we can break it into a sub-array to traverse  only values that are lower current target
 * If not sorted then sort the Array to reduce n*m calls
 * do they have to be first two number or any two_number 
 *   
 * Approach 
 * Add first number with every other number in the array [outer_for Inner_for O(n)2] store in a local variable and compare
 * if two number match lets break the target into two number O(n*m). 
 * with the first number 
 */

public class TwoSumsEqualToNnumber {
	
	public static void main(String args[]){
		int[] intArr = {1,2,7,8,11,15};
		int target = 9;
		
		int a[] = { 1, 2, 3, 4, 5, 16, 17, 18, 19, 249 };
		int number = 253;
		
		System.out.println(Arrays.toString(sumOfTwo(a, number)));
	}
	
	public static int[] sumOfTwo(int[]nums, int target){
		//TODO
		//1.Validation check 
		if(nums == null || nums.length < 2 || target == 0){
			return new int[] {0,0};
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++){
			if(map.containsKey(nums[i])){
				return new int[]{map.get(nums[i]),nums[i]};
			}else{
				map.put(target-nums[i], nums[i]);
			}
		}
		return new int[] {0,0};
	}
	
}
