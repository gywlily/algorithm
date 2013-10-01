package com.leetcode.list;

public class ReverseNodeInKGroup {
	public Node reverse(Node root, int n) {
		if (root == null)
			return null;
		Node leftEnd = null, midStart, midEnd, newHead = null, rightStart = root;
		while (true) {
			int count = 1;
			midStart = midEnd = rightStart;
			// 找到下一段需要reverse的subList
			while (count < n && midEnd.right != null) {
				count++;
				midEnd = midEnd.right;
			}
			rightStart = midEnd.right; // 保存
			Node start, end;
			if (count == n) {
				reverseList(midStart, midEnd);
				start = midEnd;
				end = midStart;
			} else {
				start = midStart;
				end = midEnd;
			}
			if (newHead == null)
				newHead = start;
			if (leftEnd != null)
				leftEnd.right = start;
			leftEnd = end; // 保存上一个n个node的最后一个元素
			if (rightStart == null)
				break;
		}
		leftEnd.right = null;
		return newHead;
	}

	public void reverseList(Node head, Node end){ 
		 Node current = head; 
		 head = null; 
		 while (head != end){ 
			 Node temp = current;
			 if(current != null)
				 current = current.right; 
			 temp.right = head;
			 head = temp;
		} 
	}
}
