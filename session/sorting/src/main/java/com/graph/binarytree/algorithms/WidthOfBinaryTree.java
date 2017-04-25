package com.graph.binarytree.algorithms;
//http://algorithms.tutorialhorizon.com/find-the-maximum-width-of-a-binary-tree/
/*
 * Maximum width of a tree is noth­ing but the Max(nodes at each level).
 * 
 * The solution of this problem is very simple, Do level order traversal and in recursive calls count 
 * 
 * the number of nodes at each level and keep track of Max of them and at the end return the max.
   Read this solution ” Level Order Traversal, Print each level in separate line” and implement the above approach.
 */
import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree {
    
	public static int maxWidth = 0;
	
	public int getBSTWidth(Node root){
		if(root == null){
			return 0;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int levelNodes = 0;
		
		while(!q.isEmpty()){
			levelNodes = q.size();
			if(levelNodes > maxWidth){
				maxWidth = levelNodes;
			}
			while(levelNodes > 0){
				Node n = (Node)q.remove();
				if(n.left != null) q.add(n.left);
				if(n.right != null) q.add(n.right);
				levelNodes --;
			}
		}
		return maxWidth;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);

		WidthOfBinaryTree i  = new WidthOfBinaryTree();
		int x = i.getBSTWidth(root);
		System.out.println("Maximum Width of a binary Tree is : " + x);
	}
	
}
