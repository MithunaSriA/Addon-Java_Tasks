package com.demo1;

public class SingleInheritance extends Parent {
	public static void main(String args[]) {
		add();
		System.out.println(m);
	}
}
class Parent{
	public static int m=19;
	public static int s=24;
	static int add() {
		return m+s;
	}
}