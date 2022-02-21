package practicestrings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String st=s.nextLine();
		String a[]=st.split(" ");
		System.out.println("The number of words in the given sentence is : "+a.length);
	}

}
