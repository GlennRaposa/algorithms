package com.a.matrix.puzzels.question;

import java.util.Arrays;
/*
  //---- http://www.sanfoundry.com/java-program-solve-knapsack-problem-using-dp/
  Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. 
  In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated 
  with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value 
  subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, 
  either pick the complete item, or don’t pick it (0-1 property).
  
  1) Optimal Substructure:
     To consider all subsets of items, there can be two cases for every item: 
        (1) the item is included in the optimal subset, 
        (2) not included in the optimal set.
     Therefore, the maximum value that can be obtained from n items is max of following two values.
        1) Maximum value obtained by n-1 items and W weight (excluding nth item).
        2) Value of nth item plus maximum value obtained by n-1 items and W minus weight of the nth item (including nth item).

   Objective: Get most valuable set of items S with Max_weight M
              Remove some item K
              The rest of S is the most valuable set of items weighing M-wk from n-1 items
 
   Build the Recursion
   c[i][M] = value of solution for items 1....i with max weight M
   
              O if i=0;w=M=0
   C[i][w] =   
              max(v[i-1]+C[i-1][w-wt[i-1]], C[i-1][M]);  //if i>0 and wi < M
              
              c[i-1][w]  if wi > M  //if weight is larger then end
 */
//Time Complexity: O(nW) 
class KnapsackInteger01 {
	
	 public static void main(String args[])
	 {
		 int []val = {60, 100, 120};  //value
		 int []wt = {10, 20, 30};  //weights 
		 int M = 50;  //max_capacity
		 int n = val.length; //number of items

		 System.out.println("Knapsack Iterative::"+KnapsackIterative(M, wt, val, n));
		 
	 }
	 
	 public static int max(int a, int b){
		 return (a>b) ? a : b;
	 }
	 
	 public static int KnapsackIterative(int M, int[] wt, int[] v, int n){
		 if(M == 0){
			 return 0;
		 }
		 int i, w;
		 int[][] C = new int[n+1][M+1];
		 
		 for(i = 0; i<=n; i++){ //will execute 3 times 
			 
			 for(w= 0; w<=M; w++){//will execute 50times
			
				 if(i==0 || w==0){
					 C[i][w] = 0;
				 }
				 
				 else if(wt[i-1] <= w){
					 C[i][w] = max(v[i-1]+C[i-1][w-wt[i-1]], C[i-1][M]);
				 }
				 
				 else{
					 C[i][w] = C[i-1][w];
				 }
			 }
		 }
		 //System.out.println("Print Array ::"+Arrays.deepToString(C));
		 return C[n][M];
	 }
	
	
	
	
	
	
	
	
	
/*
 * RECURSION : Returns the maximum value that can be put in a knapsack of capacity W
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 */
	/*public static int knapSack(int W, int wt[], int val[], int n) {
		// Base Case
		if (n == 0 || W == 0)
			return 0;

		// If weight of the nth item is more than Knapsack capacity W, then
		// this item cannot be included in the optimal solution
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
					knapSack(W, wt, val, n - 1));
	}
*/
}
