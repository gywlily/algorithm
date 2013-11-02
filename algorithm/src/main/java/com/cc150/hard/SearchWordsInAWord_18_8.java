package com.cc150.hard;

import java.util.Arrays;

public class SearchWordsInAWord_18_8 {
	public void search(String word, String[] dics){
		ArrayNode treeDic = createTreeDic(word);
		for(String wd : dics){
			searchWord(treeDic, wd);
		}
	}
	
	private void searchWord(ArrayNode root, String word){
		ArrayNode node = root;
		for(char ch : word.toCharArray()){
			if(node.nodes[ch - 'a'] == null)
				return;
			node = node.nodes[ch - 'a'];
		}
		System.out.println(word);
	}
	
	private ArrayNode createTreeDic(String word){
		char[] arr = word.toCharArray();
		ArrayNode root = new ArrayNode();
		for(int i = arr.length - 1; i >= 0; i--){
			ArrayNode node = root;
			for(int j = i; j < arr.length; j++){
				if(node.nodes[arr[j] - 'a'] == null)
					node.nodes[arr[j] - 'a'] = new ArrayNode();
				node = node.nodes[arr[j] - 'a'];
			}
		}
		return root;
	}
}

class ArrayNode{
	ArrayNode[] nodes = new ArrayNode[26];
	public ArrayNode(){
		Arrays.fill(nodes, null);
	}
}
