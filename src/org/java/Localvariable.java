package org.java;

public class Localvariable {

	
	private void add() {
		int a=100;
		System.out.println("method1="+a);
		
		
	}
	
	public static void main(String[] args) {
		Localvariable lo = new Localvariable();
		int a=20;
		System.out.println("method2="+a);
		lo.add();
		
	}
}
