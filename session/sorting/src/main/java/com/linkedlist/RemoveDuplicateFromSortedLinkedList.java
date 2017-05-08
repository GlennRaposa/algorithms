package com.linkedlist;
/*
 * http://www.makeinjava.com/remove-duplicate-nodes-sorted-singly-linked-list-java-example/
 * Start the iterating linked list from head
	Compare head element 1 with next element 2
	Check 1 == 2 ? They are not equals.
	Let move ahead in linked list
	Compare element 2 [Second node] with element 2 [Third node]
	Check 2 == 2?  Yes, these are duplication nodes.
	Let us remove the element 2 [Third node] from linked list
	Save the reference of element 3 (fourth node)
	nextNode = head.next.next
	Delete element 2 at Third position
	head.next = null
	Now connect element 2 [Second position] with element 3 (fourth position)
	head.next = nextNode
	We have removed element 2 [Earlier Third node] from linked list
	Now go ahead with iteration to remove rest of duplicate elements
	We will remove duplicated element 3 from linked list in similar way
	We have shown the removal of duplicate elements in Fig 2.
 */
public class RemoveDuplicateFromSortedLinkedList {
	
	public static void removeDuplicates(Node head) {
		// first node to be inserted
		if (null == head) {
			System.out.println("Linked list is empty");
			return;
		}
		Node nextNode = null;
		while (head.next != null) {
			// check for duplicates
			// E.g 1->2->2->3
			if (head.data == head.next.data) {
				nextNode = head.next.next;
				// deleting next node...
				// let gc take care of it
				head.next = null;
				head.next = nextNode;
			} else {
				// no duplicate..move to next node
				head = head.next;
			}
		}
	}

	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] listData = { 1, 2, 2, 3, 3, 9 };
		Node head = new Node(listData[0]);
		for (int count = 1; count < listData.length; count++)
		RemoveDuplicateFromSortedLinkedList.insert(head, listData[count]);

		System.out.printf("Linked list is : ");
		RemoveDuplicateFromSortedLinkedList.print(head);

		RemoveDuplicateFromSortedLinkedList.removeDuplicates(head);
		System.out.printf("Linked list after removing duplicates : ");
		RemoveDuplicateFromSortedLinkedList.print(head);
	}
}
