package practicestrings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String st=s.nextLine();
		String a[]=st.split(" ");
		StringBuffer sb;
		System.out.println("the result is : ");
		for(int i=0;i<a.length;i++) {
			sb=new StringBuffer(a[i]);
			System.out.print(sb.reverse()+" ");
		}
		
	}

}
