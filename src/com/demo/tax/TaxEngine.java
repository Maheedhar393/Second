package com.demo.tax;

public class TaxEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomeTaxCalculator itc1=new IncomeTaxCalculator();
		itc1.basicPay=10000;
		itc1.citizenship=true;
		itc1.calculateIncomeTax();
		itc1.applyTax();
		itc1.validatePay();
		IncomeTaxCalculator itc2=new IncomeTaxCalculator();
		itc2.basicPay=225000;
		itc2.citizenship=true;
		itc2.calculateIncomeTax();
		itc2.applyTax();
		itc2.validatePay();
	}

}
