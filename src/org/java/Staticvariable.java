package org.java;

public class Staticvariable {

	static int a;
	
	private void add() {
		a=100;
		System.out.println("method1="+a);

	}
	public static void main(String[] args) {
		Staticvariable st = new Staticvariable();
		System.out.println("Befor method calling="+a);
		
		st.add();
		
		System.out.println("after method="+a);
		
		Staticvariable st1= new Staticvariable();
		st1.add();
		
		Staticvariable st2 = new Staticvariable();
		st2.add();
		System.out.println("oo"+a);
	}
}
