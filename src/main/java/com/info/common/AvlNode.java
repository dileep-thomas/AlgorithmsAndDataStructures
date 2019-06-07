package com.info.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AvlNode {
	private int key;
	private int height;
	private AvlNode left;
	private AvlNode right;

	public AvlNode(int value, int height) {
		this.key = value;
		this.height = height;
	}

}
