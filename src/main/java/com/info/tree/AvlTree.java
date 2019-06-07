package com.info.tree;

import com.info.common.AvlNode;

public class AvlTree {

	AvlNode root = null;

	public AvlNode createNode(int value) {
		return new AvlNode(value, 1);

	}

	public AvlNode insert(int key) {
		root = insert(key, root);
		return root;
	}

	public int height(AvlNode node) {
		if (node == null) {
			return 0;
		} else {
			return node.getHeight();
		}

	}

	public int max(int a, int b) {
		return (a > b) ? a : b;
	}

	private AvlNode insert(int key, AvlNode currentNode) {
		if (currentNode == null) {
			return createNode(key);
		} else if (key < currentNode.getLeft().getKey()) {
			currentNode.setLeft(insert(key, currentNode.getLeft()));

		} else if (key > currentNode.getLeft().getKey()) {
			currentNode.setRight(insert(key, currentNode.getRight()));
		}

		int height = 1 + max(height(currentNode.getLeft()), height(currentNode.getRight()));
		currentNode.setHeight(height);

		int balance = checkBalance(currentNode);

		// LL
		if (balance > 1 && key < currentNode.getLeft().getKey()) { // LL
			return rightRotate(currentNode);
		} else if (balance < -1 && key < currentNode.getRight().getKey()) { // RR
			return leftRotate(currentNode);
		} else if (balance > 1 && key > currentNode.getLeft().getKey()) { // LR
			currentNode.setLeft(leftRotate(currentNode.getLeft()));
			return rightRotate(currentNode);
		} else if (balance < -1 && key < currentNode.getRight().getKey()) { // RL
			currentNode.setRight(rightRotate(currentNode.getRight()));
			return leftRotate(currentNode);
		}

		return currentNode;
	}

	private AvlNode rightRotate(AvlNode currentNode) {
		AvlNode newNode = currentNode.getLeft();
		currentNode.setLeft(currentNode.getLeft().getRight());
		newNode.setRight(currentNode);
		currentNode.setHeight(max(height(currentNode.getLeft()), height(currentNode.getRight()) + 1));
		newNode.setHeight(max(height(newNode.getLeft()), height(newNode.getRight()) + 1));
		return newNode;
	}

	private AvlNode leftRotate(AvlNode currentNode) {
		AvlNode newNode = currentNode.getRight();
		currentNode.setRight(currentNode.getRight().getLeft());
		newNode.setLeft(currentNode);
		currentNode.setHeight(max(height(currentNode.getLeft()), height(currentNode.getRight()) + 1));
		newNode.setHeight(max(height(newNode.getLeft()), height(newNode.getRight()) + 1));
		return newNode;
	}

	private int checkBalance(AvlNode currentNode) {
		if (currentNode == null) {
			return 0;
		} else {
			return height(currentNode.getLeft()) - height(currentNode.getRight());
		}
	}
}
