package com.linkedlist;
/*
 * http://www.java2blog.com/2014/07/how-to-detect-loop-in-linkedlist-in.html
 * http://www.makeinjava.com/floyds-cycle-detection-algorithm-check-loop-single-linked-list/
 * 
 * Floyd’s cycle detection algorithm
	Take slow and fast pointer.
	slow and fast pointer will point to head of linked list
	slow pointer will jump by 1 node.
	fast pointer will jump by 2 nodes.
 */
public class DetectLoopInLinkedList {
	
	public boolean ifLoopExists(Node head) {
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr){
				return true;
			}	
		}
		return false;
	}
	
}
