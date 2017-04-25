package com.graph.binarytree.algorithms;

import java.util.LinkedList;
import java.util.Queue;
/*
 Objec­tive:  Find the Height of a tree with­out Recursion.

In our ear­lier post “Height of tree” we had used recur­sion to find it. In this post we will see how to find it with­out using recursion.

Approach:

Approach is quite sim­i­lar to Level Order Tra­ver­sal which uses Queue.
Take int height =0.
Here we will use NULL as a marker at every level, so when­ever we encounter null, we will incre­ment the height by 1.
First add root to the Queue and add NULL as well as its marker.
Extract a node from Queue.
Check it is NULL, it means either we have reached to the end of a level OR entire tree is traversed.
So before adding null as marker for the next level, check if queue is empty, which means we have trav­eled all the lev­els and if not empty then add NULL as marker and increase the height by 1.
If Extracted node in Step 6, is NOT NULL add the chil­dren of extracted node to the Queue.
Repeat Steps from 5 to 8 until Queue is Empty.
See the Code for bet­ter explanation.
Code:
 */
public class HeightInBinaryTree {
	
	public int getBSTMaxHeight(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		int height = 0;
		// use NULL as a marker at every level, so whenever we encounter null, we
		// will increment the height by 1
		while(!q.isEmpty()){
			Node n = q.remove();
			// check if n is null, if yes, we have reached to the end of the
			// current level, increment the height by 1, and add the another
			// null as marker for next level
			if(n == null){
				if(!q.isEmpty()){
					q.add(null);
				}
				height++;
				
			}else{
				if(n.left != null) q.add(n.left);
				if(n.right != null) q.add(n.right);
			}
		}
		return height;
		
	}
	
	/*
		Recursion:
		Get the height of left sub tree, say leftHeight
		Get the height of right sub tree, say rightHeight
		Take the Max(leftHeight, rightHeight) and add 1 for the root and return
		Call recur­sively.
	 */
	public int treeHeightRecursion(Node root){
		if(root==null)return 0;
		return (1+ Math.max(treeHeightRecursion(root.left),treeHeightRecursion(root.right)));
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(8);

		HeightInBinaryTree i = new HeightInBinaryTree();
		System.out.println("Tree Height " + i.getBSTMaxHeight(root));

	}

}

