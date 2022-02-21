package practicestrings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a two words");
		String s1=s.next();
		String s2=s.next();
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)&&a.length==b.length) {
			System.out.println("The two strings are ANAGRAMS");
		}
		else{
			System.out.println("The two strings are NOT ANAGRAMS");
		}
		
	}

}
