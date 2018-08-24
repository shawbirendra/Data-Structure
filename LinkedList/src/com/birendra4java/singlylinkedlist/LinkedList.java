//-----------------Use Cases Of LinkedList------------------!!!
package com.birendra4java.singlylinkedlist;

/**
 * 
 * @author birendra.ks
 * @see www.facebook.com/Birendra4java
 * 
 *      * Consider the history section of web browsers, where it creates a
 *      linked list of web-pages visited, so that when you check history
 *      (traversal of a list) or press back button, the previous node's data is
 *      fetched.
 * 
 *      One common sighted example is low level memory management (i.e. the heap
 *      as managed by malloc in C or new in Java, etc) is often implemented as a
 *      linked list, with each node representing a used or available (free)
 *      block of memory. These blocks may be of any size, change size (combine
 *      and split), be freed or assigned in any order, and reordered. A linked
 *      list means you can keep track of all of these "nodes" and manipulate
 *      them fairly easily.
 * 
 *      Hashtables that use chaining to resolve hash collisions typically have
 *      one linked list per bucket for the elements in that bucket.
 * 
 *      A simple real life example is a Train, here each coach is connected to
 *      its previous and next coach (Except first and last). In terms of
 *      programming consider coach body as node value and connectors as links to
 *      previous and next nodes.
 * 
 * 
 *      It is highly useful in filesystem handling where for example the file
 *      allocation table contains a sequential list of locations where the files
 *      is split up and stored on a disk. Remember that overtime it is hard for
 *      an OS to find disk space to cover the entire file so it usually splits
 *      these up into chunks across the physical hard drive and stores a
 *      sequential list of links together as a linked list.
 *
 */
class Node {

	public int data;
	public Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}
}

public class LinkedList {
	public Node head;

	// ----------TO ADD DATA----------
	/**
	 * 
	 * @param data
	 *            This Method to add data in LinkedList
	 */
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	// ----------TO PRINT DATA----------
	/**
	 * This method to print LinkedList
	 */
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println();
	}

	// ------TO REVERSE LinkedList without Space-----
	/**
	 * 
	 * @param head
	 * 
	 */
	public void reverseSLL(Node head) {
		
		System.out.println("-------PRINTING REVERSE WITHOUT RECURSION --------");
		// initially current pointing to head
		Node current = head;
		// initially assuming last as null
		Node last = null;

		// whole process will be continuing till last not matching with head.
		// e.g., total data is 5, head points to data '1' then REVERSING last data i.e.,
		// 5-4-3... till '1'
		// if LAST points to HEAD then loop ends here.
		// here last 'null' & head points to data 1, that is not null so, below
		// condition true.
		while (last != head) {

			// whole process will be continuing till current.next not becoming equal to last
			// because at one point it has to be equal to last
			//
			while (current.next != last) {
				current = current.next;
			}
			// Now, current is pointing before ->null i.e., at 5th node because current.next
			// is null
			// so last will be pointing to 5th element
			last = current;
			// we are printing the last element of 5th node.
			// output will be -> 5 -> 4 -> 3 -> 2 -> 1
			System.out.print(" -> " + last.data);

			// Here again making current to point at head
			// so current pointing to 1st node.
			current = head;

			// will be in loop till last not equal to head
			// LAST has to point to 1st element and our job done.
		}
	}

	// ------TO REVERSE LinkedList USING RECURSION-----
	/**
	 * 
	 * @param head
	 *            Reversing of Singly LinkedList using Recursion
	 */
	public void reverse(Node head) {
		if (head == null) {
			System.out.println();
			return;
		}
		reverse(head.next);
		System.out.print(head.data + " <- ");

	}

	public static void main(String[] args) {
		// This is Custom LinkedList i.e., Current Class not predefined.
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		// Printing
		ll.print();
		// Printing in Reverse without Recursion.
		ll.reverseSLL(ll.head);

	}

}
