package com.cc150.list;

import java.util.HashSet;

public class RemoveDuplicateValues_2_1 {
	public void removeBruteForcely(Node head){
		Node cur = head;
		while(cur != null){
			Node f = cur.right;
			Node s = cur;
			while(f != null){
				if(f.value == cur.value)
					s.right = f.right;
				else
					s = f;
				f = f.right;				
			}
			cur = cur.right;
		}
	}
	
	public void removeWishHashTable(Node head){
		Node f = head.right, s = head;		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(s.value);
		while(f != null){
			if(set.contains(f.value)){
				s.right = f.right;
			} else {
				s = f;
				set.add(f.value);
			}
			f = f.right;
		}
	}
}
