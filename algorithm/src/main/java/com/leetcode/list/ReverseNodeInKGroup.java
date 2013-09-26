package com.leetcode.list;

public class ReverseNodeInKGroup {
	public Node reverse(Node root, int n){
		if(root == null) return null;		
		Node leftEnd = null, midStart = root, midEnd = root, rightStart = root;
		while(true){
			int count = 0;
			midStart = midEnd = rightStart;
			while(count < n && midEnd.right != null){
				count++;
				midEnd = midEnd.right;				
			}
			rightStart = midEnd.right;
			if(count == n)
				reverse(midStart, midEnd);
			midStart.right = leftEnd;			
			leftEnd = midEnd; // 保存上一个n个node的最后一个元素
			if(rightStart == null)
				break;
		}
		return midEnd;
	}
	
	private void reverse(Node left, Node right){
		if(left.right == null) return;  // 1个node 
		if(left.right.right == null) {// 2个nodes
			right.right = left;
			return;
		}
		
		Node node1 = left.right.right, node2 = left.right, node3 = left;
		while(node2 != null && node3 != right){
			node2.right = node3;
			node3 = node2;
			node2 = node1;
			if(node1 != null)
				node1 = node1.right;			
		}
		return;
	}
}
