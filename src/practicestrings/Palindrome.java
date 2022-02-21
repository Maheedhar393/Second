package practicestrings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String st=s.next();
	    StringBuffer sb=new StringBuffer(st);
	    if(st.equals(sb.reverse().toString())) {
	    	System.out.println("The given word is PALINDROME");
	    }
	    else {
	    	System.out.println("The given word is NOT PALINDROME");
	    }
	}

}
