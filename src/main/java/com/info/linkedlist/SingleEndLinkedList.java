package com.info.linkedlist;

import com.info.common.Node;

/**
 * 
 * @author dileep-thomas
 *
 */
public class SingleEndLinkedList {

	private Node head;

	public Node insert(String key) {
		Node node = new Node(key);
		if (isEmpty()) {
			head = node;
			head.setNext(null);
		} else {
			node.setNext(head);
			head = node;
		}
		return head;

	}

	public void traverse() {
		Node current = head;
		while (current != null) {
			current.display();
			if (current.getNext() == null) {
				return;
			} else {
				current = current.getNext();

			}

		}
	}

	public void delete(String key) {

		Node previous = head;
		Node current = head;

		while (current.getValue() != key) {
			if (current.getNext() == null) {
				return;
			} else {
				previous = current;
				current = current.getNext();
			}

		}

		if (current == head && current.getNext() == null) { // first
			head = null;
		} else {
			current = current.getNext();
			previous.setNext(current);
		}

	}

	public Node find(String key) {
		Node current = head;
		while (current.getValue() != key) {
			if (current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}

		}
		return current;

	}

	private boolean isEmpty() {
		return head == null;
	}

}
