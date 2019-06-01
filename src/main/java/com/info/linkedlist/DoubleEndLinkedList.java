package com.info.linkedlist;

import com.info.common.Node;

/**
 * 
 * @author dileep-thomas
 *
 */
public class DoubleEndLinkedList {

	private Node head;
	private Node tail;

	public Node insertAtfirst(String key) {

		Node node = new Node(key);

		if (isEmpty()) {
			tail = node;
		} else {
			node.setNext(head);

		}
		head = node;
		return node;

	}

	public Node insertAtEnd(String key) {
		Node node = new Node(key);

		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
		}
		tail = node;
		return node;

	}

	private boolean isEmpty() {
		return head == null;

	}

}
