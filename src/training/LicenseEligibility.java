package training;

import java.util.Scanner;

public class LicenseEligibility {
    static boolean findLicenseEligibility(int age,String state) {
    	
    	if(age>18&&age<60) {
    		if(state=="TN"||state=="KA"||state=="KL") {
    			return true;
    		}
    		else if(age>15) {
    			return true;
    		}
    	}
    	else if(age>60||age<18) {
    		if(state=="TN"||state=="KA"||state=="KL") {
    			return false;
    		}
    		else if(age>15) {
    			return true;
    		}
    	}
    	else {
    		if(age<15) {
    			return false;
    		}
    	}
    		
    	return false;	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter age :");
		int age=s.nextInt();
		System.out.println("enter state : ");
		String state=s.next();
		System.out.println("The result is : "+findLicenseEligibility(age, state));
	}

}
