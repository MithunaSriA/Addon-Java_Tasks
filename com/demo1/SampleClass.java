package com.demo1;
import java.util.Scanner;
public class SampleClass {
	public static void main(String args[]) {
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.next();
		System.out.println("Enter the character:");
		char ch=s.next().charAt(0);
		int n=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{if(arr[i]==ch)
		n++;
		}
		System.out.println(n);
	}

}
