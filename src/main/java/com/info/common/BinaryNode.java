package com.info.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BinaryNode {

	private int value;
	private BinaryNode left;
	private BinaryNode right;

	public BinaryNode(int value) {
		this.value = value;
	}

	public void display() {
		System.out.println("Value :" + value);
	}
}
