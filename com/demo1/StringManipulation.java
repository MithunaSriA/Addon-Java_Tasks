package com.demo1;
	import java.util.Arrays;
	public class StringManipulation {
	public static void main(String args[])
	{
		String name="Mithuna";
		String obj=new String("Mithuna");  //false
		//obj="Mithuna"; true
		//comparison operator check only memory address
		System.out.println(name==obj);
		System.out.println(name.equals(obj));
		//equals check for the character similar
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.toUpperCase());
		char u=name.charAt(0);
		System.out.println(name.charAt(0));
		System.out.println(u);
		System.out.println(name.indexOf('u'));
		System.out.println(name.lastIndexOf('n'));
		System.out.println(name.substring(0,6));
		//0 to 6 means 0,1,2,3,4,5 does not print 6th value
		char[] n=name.toCharArray();
		System.out.println(name.toCharArray());
		//split the string into character
		System.out.println(n);
		System.out.println(name.split("a"));
		String[] v=name.split("");
		System.out.println(Arrays.toString(v));
		System.out.println(name.trim());
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" S"));
		System.out.println(name.replace('a',' '));
		System.out.println(name.replaceAll("Mithuna","Mithun"));
	}
	}


