package com.info.tree;

import com.info.common.BinaryNode;

/**
 * 
 * @author dileep-thomas
 *
 */
public class BinarySearchTree {

	BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	public BinaryNode insert(int value) {
		root = insert(root, value);
		return root;

	}

	public BinaryNode insert(BinaryNode currentNode, int value) {

		if (currentNode == null) {
			return createNode(value);
		} else if (value <= currentNode.getValue()) {
			currentNode.setLeft(insert(currentNode.getLeft(), value));
			return currentNode;
		} else {
			currentNode.setRight(insert(currentNode.getLeft(), value));
			return currentNode;
		}

	}

	public BinaryNode findNode(int value) {
		return findNode(root, value);

	}

	public BinaryNode findNode(BinaryNode currentNode, int value) {

		if (currentNode != null) {
			if (currentNode.getValue() == value) {
				return currentNode;
			} else if (value < currentNode.getValue()) {
				return findNode(currentNode.getLeft(), value);
			} else {
				return findNode(currentNode.getRight(), value);
			}
		}
		return currentNode;

	}

	private BinaryNode createNode(int value) {
		BinaryNode node = new BinaryNode(value);
		return node;
	}

	public BinaryNode delete(int value) {
		return delete(root, value);
	}

	public BinaryNode delete(BinaryNode currentNode, int value) {

		if (currentNode != null) {
			if (value < currentNode.getValue()) {
				currentNode.setLeft(delete(currentNode.getLeft(), value));
			} else if (value > currentNode.getValue()) {
				currentNode.setRight(delete(currentNode.getRight(), value));
			} else {

				if (currentNode.getLeft() != null && currentNode.getRight() != null) {
					BinaryNode temp = currentNode;
					BinaryNode minNode = minNode(currentNode.getRight());
					currentNode.setValue(minNode.getValue());
					currentNode.setRight(delete(temp.getRight(), minNode.getValue()));

				} else if (currentNode.getLeft() != null) {
					currentNode = currentNode.getLeft();
				}
				if (currentNode.getRight() != null) {
					currentNode = currentNode.getRight();
				} else {
					currentNode = null;
				}

			}

		}
		return currentNode;
	}

	private BinaryNode minNode(BinaryNode node) {
		if (node.getLeft() == null) {
			return node;
		} else {
			return minNode(node.getLeft());
		}
	}
}
