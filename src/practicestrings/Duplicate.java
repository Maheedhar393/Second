package practicestrings;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		System.out.println("The duplicate characters are : ");
		for(int i=0;i<st.length();i++) {
			if(hm.containsKey(st.charAt(i))) {
				if(hm.get(st.charAt(i))<2) {
				int k=hm.get(st.charAt(i));
				k++;
				hm.put(st.charAt(i),k);
				System.out.print(st.charAt(i)+" ");
				}
			}
			else {
				hm.put(st.charAt(i),1);
			}
		}
		
		
	}

}
