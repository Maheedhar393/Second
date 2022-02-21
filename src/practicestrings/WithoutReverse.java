package practicestrings;

import java.util.Scanner;

public class WithoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String st=s.next();
		System.out.println("The reversed string is : ");
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
	}

}
