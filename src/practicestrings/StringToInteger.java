package practicestrings;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=s.next();
		try {
		System.out.println("The integer value of the string is : "+Integer.parseInt(st));
		}
		catch(Exception e) {
			System.out.println("Please a proper string to convert it into integer");
		}
		
	}

}
