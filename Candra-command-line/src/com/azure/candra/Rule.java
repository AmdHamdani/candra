package com.azure.candra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rule {
	
	public String readFileToString(String name) {
		String words = "";
		try {
			words = new String(Files.readAllBytes(Paths.get(name)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}

	public List setRules(String words) {
		List<String> temp = Arrays.asList(words.split("[\\r|\\n]+"));
		List<Word> rule = new ArrayList<Word>();
		
		for(int i = 2; i < temp.size(); i += 2)
			rule.add(new Word(temp.get(i), temp.get(i+1)));
			
		return rule;
	}
	
}