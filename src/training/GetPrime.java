package training;

import java.util.Scanner;

public class GetPrime {

	static void getPrime(int a,int b) {
		int ar[]=new int[b];
		int c=0,k=0;
		for(int i=a;i<b;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==0&&i>2) {
				
				ar[k]=i;
				k++;
			}
			c=0;
		}
		System.out.println("the prime numbers are :");
		for(int i=0;i<k;i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a=s.nextInt();
		int b=s.nextInt();
		getPrime(a, b);
	}

}
