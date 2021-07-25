package com.techiebirendra.singlylinkedlist;

public class LinkedListTest {
	
	
	
	
	public static void main(String[] args) {
		
		
		LinkedList ll= new LinkedList();	
		ll.add(1);
		ll.add(2);
		
			
		ll.print();
		
		ll.reverseSLL(ll.head);
		
	}

}
