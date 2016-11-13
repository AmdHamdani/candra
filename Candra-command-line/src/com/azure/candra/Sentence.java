package com.azure.candra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
	
	static List<String> sentence2Words(String sentence) {
		return new ArrayList<String>(Arrays.asList(sentence.split("\\s+")));
	}
	
	static List<String> paragraph2Sentence(String paragraph) {
		return new ArrayList<String>(Arrays.asList(paragraph.split("\\.")));
	}
}
