package com.techiebirendra.linkedlist.operation;

public class FindAndRemoveLoop {
	/*
	 * Floyd’s Cycle detection algorithm
	 */
	static Node head;

	public int detectAndRemoveLoop(Node node) {
		Node slow = node;
		Node fast = node;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			// If slow and fast meet at same point then loop is present
			if (slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;

	}

	// Function to remove loop
	public void removeLoop(Node slow, Node node) {
		Node ptr1 = slow;
		Node ptr2 = node;

		while (ptr1.next != ptr2.next) {
			ptr1=ptr1.next;
			ptr2 = ptr2.next;
		}

		/*
		 * Set the next node of the loop ending node to fix the loop
		 */
		ptr1.next = null;
	}

	// Function to print the linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		FindAndRemoveLoop loop = new FindAndRemoveLoop();
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(25);
		// print
		
		//list.printNode();
		// loop
		list.head.next.next.next.next = list.head.next;
		head=list.head;
		loop.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		loop.printList(head);
	}
}
