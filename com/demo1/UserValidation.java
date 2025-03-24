package com.demo1;

import java.util.Scanner;

public class UserValidation {
	public static void main(String args[]) throws NameValidator { 
		Scanner pm = new Scanner(System.in); 
		String name=pm.nextLine().toUpperCase();
		char[] s= name.toCharArray();
		for(char x:s) {
			if('A'<=x && 'Z'>=x) {
				System.out.println("Done");
			}
			else if('0'<=x && '9'>=x) {
				throw new NameValidator("num");
				
			}
			else {
				throw new NameValidator("Symbol");
			}
		}
	}

}

class NameValidator extends Exception {
	NameValidator(String ms){
		super(ms);
	}
}
