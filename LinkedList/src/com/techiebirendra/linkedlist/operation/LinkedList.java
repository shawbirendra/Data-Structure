package com.techiebirendra.linkedlist.operation;

public class LinkedList {
	Node head;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void printNode() {
		Node node = head;
		if (node != null) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(25);
		// print
		list.printNode();

	}
}
