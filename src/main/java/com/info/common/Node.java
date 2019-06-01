package com.info.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Node {

	private final String value;
	private Node next;
	private Node previous;

	
	public void display(){
		System.out.println("Value >"+value);
	}
}
