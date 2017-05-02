package a.com.interesting.dynamic.programming;

import java.util.ArrayList;
import java.util.List;

//http://www.gorecursion.com/algorithm/2016/11/19/recursion-tree1.html
//https://www.youtube.com/watch?v=rxitBSy8pZ0&t=5s
/*
 * 
 */
public class SubSetsFromGivenArraySet {
	//function using DFS to split into smaller subsets 
	private static List<List<Integer>> dfs(int[] nums) {
	    List<List<Integer>> all = new ArrayList();
	    List<Integer> one = new ArrayList<Integer>();
	    dfs(nums, 0, one, all);
	    return all;
	}
	private static void dfs(int[] nums, int pos, List<Integer> one, List<List<Integer>> all) {
	    if (pos == nums.length) {
	        all.add(new ArrayList<Integer>(one));
	        return;
	    }
	    dfs(nums, pos+1, one, all); 
	    one.add(nums[pos]);
	    dfs(nums, pos+1, one, all); 
	    one.remove(one.size()-1);
	}
	
	public static void main(String[] args) {
		int[] A = { 1,2,3};
		System.out.println("\nFrom DP: " + dfs(A) );
	}
}
