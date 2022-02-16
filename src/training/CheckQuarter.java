package training;

import java.util.Scanner;

public class CheckQuarter {
    static void checkQuarter(int m) {
    	if(m==1||m==2||m==3) {
    		System.out.println("Quarter 1");
    	}
    	if(m==4||m==5||m==6) {
    		System.out.println("Quarter 2");
    	}
    	if(m==7||m==8||m==9) {
    		System.out.println("Quarter 3");
    	}
    	if(m==10||m==11||m==12) {
    		System.out.println("Quarter 4");
    	}
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter a month");
		int m=s.nextInt();
		checkQuarter(m);
	}

}
