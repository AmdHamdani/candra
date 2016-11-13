package com.azure.candra;

public class Main {
	
	public static void main(String[] args) {
		Candra c = new Candra();
		System.out.println("Candra start. . .");
		System.out.print(">> ");
		c.input();
		System.out.println("------------------------------");
		c.execute();
		c.finish();
		System.out.println("Candra stop. . .");
		
	}
	
}
