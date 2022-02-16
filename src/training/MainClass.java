package training;

import java.util.Scanner;

class Calculator {
	
	void add(int a,int b) {
		System.out.println("the addition is : "+(a+b));
	}
	void sub(int a,int b) {
		System.out.println("the substraction is : "+(a-b));
	}
	void mul(int a,int b) {
		System.out.println("the multiplication is : "+(a*b));
		
	}
	void div(int a,int b) {
		System.out.println("the division is : "+(a/b));
	}

}
public class MainClass{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		Calculator cal=new Calculator();
		cal.add(a, b);
		cal.sub(a, b);
		cal.mul(a, b);
		cal.div(a, b);
		
	}
}






