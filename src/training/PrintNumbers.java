package training;

import java.util.Scanner;

public class PrintNumbers {
    static void printNumbers(int n) {
    	System.out.println("the first n numbers are : ");
    	for(int i=0;i<=n;i++) {
    		System.out.println(i);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		printNumbers(n);
	}

}
