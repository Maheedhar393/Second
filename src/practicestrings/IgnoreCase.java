package practicestrings;

import java.util.Scanner;

public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a two words");
		String s1=s.next();
		String s2=s.next();
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("They are EQUAL");
		}
		else {
			System.out.println("They are NOT EQUAL");
		}
	}

}
