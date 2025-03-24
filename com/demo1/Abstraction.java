package com.demo1;

	public class Abstraction {
		public static void main(String args[]) {
			Pooja obj=new Pooja() {
				public void name() {
					System.out.println("poovazhagan");
				}
			};
		}
	}
	abstract class Pooja{
		public abstract void name();
		public void marks() {
			System.out.println("100");
		}
	}
	interface poojan{
		public void name();
		public void marks();
	}

