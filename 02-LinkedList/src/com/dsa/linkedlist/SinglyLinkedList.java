package com.dsa.linkedlist;

public class SinglyLinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size = 0;

	public Node<E> createSinglyLinkedList(E aNodeValue) {
		Node<E> tNode = new Node<>();
		tNode.value = aNodeValue;
		tNode.next = null;
		head = tNode;
		tail = tNode;

		size = 1;

		return tNode;
	}

	public void insert(E aNodeValue) {

		if (head == null) {
			createSinglyLinkedList(aNodeValue);
			return;
		}

		Node<E> tNode = new Node<>();
		tNode.value = aNodeValue;
		tNode.next = null;

		tail.next = tNode;
		tail = tNode;

		size++;
	}

	public void insert(E aNodeValue, int aPosition) {

		Node<E> tNode = new Node<>();
		tNode.value = aNodeValue;
		tNode.next = null;

		if (aPosition == 0) {
			tNode.next = head;
			head = tNode;
		} else if (aPosition >= size) {
			tail.next = tNode;
			tail = tNode;
		} else {

			Node<E> tTempHeadNode = head;
			int tIndex = 0;
			while (tIndex < aPosition - 1) {
				tTempHeadNode = tTempHeadNode.next;
				tIndex++;
			}

			tNode.next = tTempHeadNode.next;
			tTempHeadNode.next = tNode;
		}

		size++;

	}

	public void printList() {

		Node<E> tTempHeadNode = head;

		while (tTempHeadNode != null) {
			System.out.println(tTempHeadNode.value);
			tTempHeadNode = tTempHeadNode.next;
		}
	}

	public int size() {
		return size;
	}

}
