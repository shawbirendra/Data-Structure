package com.techiebirendra.doublylinkedlist;

public class InsertionInMiddle {
	static Node head; // head of list

	/* Node Class */
	static class Node {
		int data;
		Node next;

		// Constructor to create a new node
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// function to insert node at the
	// middle of the linked list
	static void insertAtMid(int x) {
		// if list is empty
		if (head == null)
			head = new Node(x);
		else {
			// get a new node
			Node newNode = new Node(x);

			Node ptr = head;
			int len = 0;

			// calculate length of the linked list
			// , i.e, the number of nodes
			while (ptr != null) {
				len++;
				ptr = ptr.next;
			}

			// 'count' the number of nodes after which
			// the new node is to be inserted
			int count = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
			ptr = head;
			//System.out.println(ptr.next.data);
			System.out.println("\nCount : "+count);
			// 'ptr' points to the node after which
			// the new node is to be inserted
			//decreasing count
			while (count-- > 1) {
				System.out.println("\nCount inside : "+count);
				System.out.println(count-->1);
				ptr = ptr.next;
			}
			System.out.println("pointer data:"+ptr.next.data);
			// insert the 'newNode' and adjust
			// the required links
			newNode.next = ptr.next;
			ptr.next = newNode;
		}
	}

	// function to display the linked list
	static void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// Driver program to test above
	public static void main(String[] args) {
		// Creating the list 1.2.4.5
		head = null;
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);//head.next.next.next.next = new Node(6);

		System.out.println("Linked list before " + "insertion: ");
		display();

		int x = 3;
		insertAtMid(x);

		System.out.println("\nLinked list after" + " insertion: ");
		display();
	}
}
