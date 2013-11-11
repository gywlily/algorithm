package com.cc150.tree;

import java.util.ArrayList;
import java.util.List;

public class PrintTreePathEqualsSum_4_9 {
	public List<List<Integer>> print(Node root, int sum){
		List<List<Integer>> sumlist = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if(root != null){
			print(root, sum, 0, list, sumlist);
		}
		return sumlist;
	}
	
	public void print(Node root, int sum, int curSum, List<Integer> list, 
			List<List<Integer>> sumlist){
		if(root.value + curSum == sum){
			list.add(root.value);
			sumlist.add(list);
			List<Integer> list1 = new ArrayList<Integer>();
			list1.addAll(list);
			list1.remove(0);
			curSum = curSum + root.value - list.get(0);
			list = list1;
		} else if(root.value + curSum < sum){
			list.add(root.value);
			curSum += root.value;
		} else {
			while(!list.isEmpty() && curSum + root.value > sum){
				int v = list.remove(0);
				curSum -= v;
			}
			if(root.value + curSum <= sum){
				list.add(root.value);
				curSum += root.value;
				if(curSum == sum){
					sumlist.add(list);
					List<Integer> list1 = new ArrayList<Integer>();
					list1.addAll(list);
					list1.remove(0);
					curSum = curSum - list.get(0);
					list = list1;
				}
			}
		}
		List<Integer> tempList = new ArrayList<Integer>();
		tempList.addAll(list);
		if(root.left != null)
			print(root.left, sum, curSum, list, sumlist);
		if(root.right != null)
			print(root.right, sum, curSum, tempList, sumlist);
	}
}
