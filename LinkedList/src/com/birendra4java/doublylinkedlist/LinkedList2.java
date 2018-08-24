//
////-----------------Use Cases Of LinkedList------------------!!!
///**
// * Consider the history section of web browsers, where it creates a linked list of 
//   web-pages visited, so that when you check history (traversal of a list) 
//   or press back button, the previous node's data is fetched.
//  
// * One common sighted example is low level memory management 
//   (i.e. the heap as managed by malloc in C or new in Java, etc)
//    is often implemented as a linked list, with each node representing 
//   a used or available (free) block of memory.
//   These blocks may be of any size, change size (combine and split),
//   be freed or assigned in any order, and reordered. A linked list means 
//   you can keep track of all of these "nodes" and manipulate them fairly easily.
//   
// *  Hashtables that use chaining to resolve hash collisions typically have one linked 
//    list per bucket for the elements in that bucket.
//    
// * A simple real life example is a Train, here each coach is
//   connected to its previous and next coach (Except first and last).
//   In terms of programming consider coach body as node value and connectors as links to previous and next nodes.
// 
// 
// * It is highly useful in filesystem handling where for example the file allocation table contains a sequential 
//   list of locations where the files is split up and stored on a disk.
//   Remember that overtime it is hard for an OS to find disk space to cover
//   the entire file so it usually splits these up into chunks across the physical
//  hard drive and stores a sequential list of links together as a linked list.
// */
//
//package com.birendra4java.doublylinkedlist;
//
//import com.birendra4java.singlylinkedlist.Node1;
//
//public class LinkedList2 {
//
//	public Node1 head;
//
//	// public void add(int data) {
//	// Node newNode = new Node(data);
//	// if (head == null) {
//	// head = newNode;
//	// return;
//	// } else {
//	// Node current = head;
//	// while (current != null) {
//	// if (current.next == null) {
//	// current.next = newNode;
//	// break;
//	// }
//	// current = current.next;
//	// }
//	// }
//	// }
//	public void add(int data) {
//		Node1 newNode = new Node1(data);
//		if (head == null) {
//			head = new Node1(data);
//			return;
//		}
//		Node1 current = head;
//		while (current.next != null) {
//			current = current.next;
//		}
//		current.next = newNode;
//	}
//
//	public void print() {
//		Node1 current = head;
//		while (current != null) {
//			System.out.print(current.data + " -> ");
//			current = current.next;
//		}
//		System.out.println();
//	}
//
//	public void reverse(Node1 start) {
//
//		if (start == null) {
//			System.out.println();
//			return;
//		}
//		reverse(start.next);
//		System.out.print(start.data + " <- ");
//
//	}
//
//}
