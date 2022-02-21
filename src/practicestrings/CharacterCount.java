package practicestrings;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String st=s.next();
		System.out.println("enter a character");
		char a=s.next().charAt(0);
		int c=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)==a) {
				c++;
			}
		}
		System.out.println("No of times "+a+" repeated is : "+c);
	}

}
