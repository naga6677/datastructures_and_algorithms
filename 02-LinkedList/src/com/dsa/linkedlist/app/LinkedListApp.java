package com.dsa.linkedlist.app;

import com.dsa.linkedlist.SinglyLinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> tSinglyLinkedList = new SinglyLinkedList<>();

		tSinglyLinkedList.insert(10);
		tSinglyLinkedList.insert(50);
		tSinglyLinkedList.insert(15);
		tSinglyLinkedList.insert(1);
		tSinglyLinkedList.insert(100);

		tSinglyLinkedList.insert(33, 2);

		System.out.println("The Size of the List is: " + tSinglyLinkedList.size());
		
		tSinglyLinkedList.printList();

	}

}
