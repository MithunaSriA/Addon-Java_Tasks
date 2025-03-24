package task1;

	import java.util.Scanner;

	public class SampleClass2 {
		public static void main(String args[]) {
			String name;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the string:");
			String str=s.next();
			String vowel="aeiouAEIOU";
			int n=0;
			char[] arr=str.toCharArray();
			for(int i=0;i<arr.length;i++)
			{
				char ch=str.charAt(i);
				for(int j=0;j<vowel.length();j++) {
					if(ch==vowel.charAt(j));
					n++;
				}
			}
			System.out.println(n);
		}
}
