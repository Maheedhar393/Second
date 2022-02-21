package practicestrings;

import java.util.Scanner;

public class DeleteCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		StringBuffer sb=new StringBuffer(s.next());
		StringBuffer s1=new StringBuffer("");
		System.out.println("enter a character");
		char a=s.next().charAt(0);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)!=a) {
				s1.append(sb.charAt(i));
			}
		}
		System.out.println("the result is : ");
		System.out.println(s1);
		
				
	}

}
