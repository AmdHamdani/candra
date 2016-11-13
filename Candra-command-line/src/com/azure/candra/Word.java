package com.azure.candra;

public class Word {
	
	private String trueWord;
	private String falseWord;
	
	public Word(String trueWord, String falseWord) {
		this.trueWord = trueWord;
		this.falseWord = falseWord;
	}

	public String getTrueWord() {
		return trueWord;
	}

	public String getFalseWord() {
		return falseWord;
	}
	
}
