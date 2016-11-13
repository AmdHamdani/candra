package com.azure.candra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Candra {
	
	private Rule r;
	private List<String> text;
	private List<Word> typo;
	private BufferedReader in;
	
	public Candra() {
		r = new Rule();
		in = new BufferedReader(new InputStreamReader(System.in));
		buildRule();
	}

	public void input() {
		try {
			text = Sentence.paragraph2Sentence(in.readLine());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void buildRule() {
		typo = r.setRules(r.readFileToString("res/grammar.txt"));
	}
	
	private void errorFound(Word error, int i) {
		System.out.println("Kalimat ke-" + (i + 1) + " - Apakah yang anda maksud \"" + error.getTrueWord() + "\"?" );
	}
	
	public void execute() {
		for(int i = 0; i < text.size(); i++) {
			for(int j = 0; j < typo.size(); j++) {
				if(text.get(i).toLowerCase().contains(typo.get(j).getFalseWord())) {
					errorFound(typo.get(j), i);
				}
			}
		}
	}
	
	public void finish() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}
}
