package training;

import java.util.Scanner;

public class PrintDescending {
	
	static void printDescending(int a,int b) {
		for(int i=b-1;i>a;i--) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers : ");
		int a=s.nextInt();
		int b=s.nextInt();
		printDescending(a, b);
	}

}
