package com.demo1;

public class Hierarchical {
	public static void main(String args[]) {
		Child1 x=new Child1();
		Child2 y=new Child2();
		x.Mclass();
		y.Sclass();
	}
}
class Parents{
	String a="Mithuna",b="Sri";
    void Mclass() {
    	System.out.println("My name is :"+a);
    
    } 
	
}
class Child1 extends Parents{
	String c="sri",d="Mithuna";
	void Sclass() {
		//System.out.println("last name is:"+b);
		Parents in=new Parents();
		in.Mclass();
	}
	
}
class Child2 extends Parents{
	String e="Poo",f="mozhi";
	void Sclass() {
		//System.out.println("last name is:"+b);
		Parents in=new Parents();
		in.Mclass();
	}
}