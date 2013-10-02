package com.offer.tree;

public class Node {
	int value = 0;
	Node left, right;
	public Node(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
	
	@Override
	public String toString(){
		return String.valueOf(value);
	}
}
