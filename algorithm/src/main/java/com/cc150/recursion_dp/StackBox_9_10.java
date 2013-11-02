package com.cc150.recursion_dp;

import java.util.ArrayList;
import java.util.Arrays;

public class StackBox_9_10 {
	public class Box implements Comparable<Box>{
		int length;
		int weight;
		int height;
		public Box(int l, int w, int h){
			length = l;
			weight = w;
			height = h;
		}
		@Override
		public int compareTo(Box o) {
			if(this.height < o.height)
				return -1;
			else if (this.height == o.height)
				return 0;
			else return 1;
		}
		public boolean canBeAbove(Box box){
			return this.height < box.height &&
					this.length < box.length &&
					this.weight < box.weight;
		}
		public String toString(){
			return "[" + length + "," + weight + "," + height + "]";
		}
	}
	
	public void getLongestStack(Box[] boxes, ArrayList<Box> stack){
		Arrays.sort(boxes);
		ArrayList<Box> longestList = new ArrayList<Box>();
		getLongestStack(boxes, stack, boxes.length - 1, longestList);
		System.out.println(longestList);
	}
	
	private void getLongestStack(Box[] boxes, ArrayList<Box> stack, int index, ArrayList<Box> list){
		if(index >= 0){
			for(int i = index; i >= 0; i--){
				if(stack.size() > 0){
					Box topBox = stack.get(stack.size() - 1);
					if(!boxes[i].canBeAbove(topBox))
						continue;
				}
				stack.add(boxes[i]);
				getLongestStack(boxes, stack, i - 1, list);
				stack.remove(boxes[i]);
			}
		}
		
		if (list.size() < stack.size()){
			list.clear();
			list.addAll(stack);
		}
	}
}