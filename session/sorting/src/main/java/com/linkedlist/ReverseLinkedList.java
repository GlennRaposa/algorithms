 package com.linkedlist;
//http://algorithms.tutorialhorizon.com/reverse-a-linked-list/


public class ReverseLinkedList {
	
	NodeL head;
	
	class NodeL{
		int data;
		NodeL next;
		
		NodeL(int data){
			this.data = data;
			next = null;
		}
	}
	
	public ReverseLinkedList(){
		head=null;
	}

	public void addAtBegin(int data){
		NodeL n = new NodeL(data);
		n.next = head;
		head = n;
	}
	
	public void reverse(NodeL head){
		NodeL curr = head;
		NodeL next = null;
		NodeL prev = null;
		
		
		while(curr != null){
			next = curr.next; //Assign next value to temp variable so we dont loss next value
			curr.next = prev; // Next value will be equal to previus value. in first case will be null 
			prev = curr; // set current into previous 
			curr = next; // to keep iteration going to next node  
		}
		head = prev;
		System.out.println("\n Reverse Through Iteration");
		display(head);
	}
	
	public void display(NodeL head){
		//
		NodeL currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		ReverseLinkedList a = new ReverseLinkedList();
		a.addAtBegin(5);
		a.addAtBegin(10);
		a.addAtBegin(15);
		a.addAtBegin(20);
		a.addAtBegin(25);
		a.addAtBegin(30);
//		System.out.print("Original Link List 1 : ");
		a.display(a.head);
		a.reverse(a.head);
	}

}
