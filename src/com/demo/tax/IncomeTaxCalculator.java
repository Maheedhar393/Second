package com.demo.tax;

public class IncomeTaxCalculator {
	float basicPay,incomeTax;
	boolean citizenship;
	int nettPay;
	void calculateIncomeTax() {
		incomeTax=10*basicPay/100;
		System.out.println("The Income Tax of the employee for the"+basicPay+" is "+incomeTax);
	}
	void applyTax() {
		float k=basicPay-incomeTax;
		nettPay=(int)k;
		System.out.println("The nett pay of the employee "+nettPay);
	}
	void validatePay() {
		if(basicPay>200000&&citizenship) {
			System.out.println("The salary and citizenship eligibility: true");
		}
		else {
			System.out.println("The salary and citizenship eligibility: false");
		}
	}
	
}
