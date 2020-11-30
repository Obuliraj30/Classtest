package org.java;

public class Instancevariable {
	
	int a;
	private void add() {
	a=100;
	System.out.println("method1="+a);
		
	}
	public static void main(String[] args) {
		Instancevariable in = new Instancevariable();
		System.out.println("Before method calling="+ in.a);
		
		in.add();
		System.out.println("after method calling="+in.a);
		Instancevariable in2 = new Instancevariable();
		
		System.out.println("Done="+in2.a);
		
	}
	
	

}
