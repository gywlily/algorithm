package com.cc150.list;

public class Node {
	int value = 0;
	Node left, right;
	public Node(int v){
		value = v;
	}
	
	@Override
	public String toString(){
		return String.valueOf(value);
	}
}
