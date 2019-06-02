package com.info.linkedlist;

import com.info.common.Node;

public class DoublyLinkedList {
	private Node head;
	private Node tail;

	public Node insertAtfirst(String key) {

		Node node = new Node(key);

		if (isEmpty()) {
			tail = node;
		} else {
			node.setNext(head);

		}
		head.setPrevious(node);
		head = node;
		return node;

	}

	public Node insertAtEnd(String key) {
		Node node = new Node(key);

		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		return node;

	}

	public boolean insertAfterKey(String key) {
		Node node = new Node(key);
		Node currentNeighbour = head;
		while (currentNeighbour.getValue() != key) {
			currentNeighbour = currentNeighbour.getNext();
			if (currentNeighbour == null) {
				return false;
			} else {

			}
		}

		if (currentNeighbour == tail) {
			node.setNext(null);
			tail = node;
		} else {
			node.setNext(currentNeighbour.getNext());
			currentNeighbour.getNext().setPrevious(node);

		}

		node.setPrevious(currentNeighbour);
		currentNeighbour.setNext(node);

		return true;
	}

	private boolean isEmpty() {
		return head == null;

	}
}
