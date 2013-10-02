package com.cc150.hard;

import org.junit.Test;

public class SearchWordsInAWordTest_18_8 {
	@Test
	public void testSearch(){
		SearchWordsInAWord_18_8 swi = new SearchWordsInAWord_18_8();
		String[] dics = new String[]{"mord", "dog", "red"};
		swi.search("moredog", dics);
	}
}
