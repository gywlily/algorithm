package com.offer.list;

import java.util.HashMap;

public class CopyComplexList_26 {
	public Node copy(Node root){
		if(root == null) return null;
		Node newHead = null, curNew = null, cur = root;
		HashMap<Node, Node> map = new HashMap<Node, Node>();
		while(cur != null){
			if(newHead == null){
				newHead = new Node(root.value);
				curNew = newHead;
			} else{
				curNew.right = new Node(cur.value);
				curNew = curNew.right;
			}
			map.put(cur, curNew);
			cur = cur.right;
		}
		cur = root;
		while(cur != null){
			if(cur.left != null){  // use left as sibling
				map.get(cur).left = map.get(cur.left);
			}
			cur = cur.right;
		}
		return newHead;
	}
}
