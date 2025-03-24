package com.demo1;

public class Multilevel extends parent1 {
	public static void main(String args[]) {
		Add();
		System.out.println(d);
	}


}
class parent2 extends Multilevel{
	public static void main(String args[]) {
		Sub();
		System.out.println(c);
	}

}
class parent1{
	public static String d="Mithuna";
	public static String c="Sri";
	static void Add() {
		System.out.println(d+c);
	}
	static void Sub() {
		System.out.println("d-c");
	}
}
