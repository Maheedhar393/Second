package com.demo.tax;

public class StudentOne {
	int marks,st_class;
	String city;
	int calculateScholarship() {
		int scholarShip=0;
		if(st_class==10) {
			if(marks<60&&marks>30) {
				scholarShip=(int)30*15000/100;
				if(city.equals("Chennai")) {
					scholarShip-=1000;
				}
				else {
					scholarShip-=3000;
				}
			}
			else if(marks<90&&marks>60) {
				scholarShip=(int)50*15000/100;
			}
			else if(marks>90) {
				scholarShip=(int)70*15000/100;
			}
			else {
				scholarShip=0;
			}
		}
		else if(st_class==11) {
			if(marks<60&&marks>30) {
				scholarShip=(int)30*25000/100;
				if(city.equals("Chennai")) {
					scholarShip-=1000;
				}
				else {
					scholarShip-=2000;
				}
			}
			else if(marks<90&&marks>60) {
				scholarShip=(int)50*25000/100;
			}
			else if(marks>90) {
				scholarShip=(int)70*25000/100;
			}
			else {
				scholarShip=0;
			}
		}
		
		return scholarShip;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOne st1=new StudentOne();
		st1.marks=50;
		st1.st_class=10;
		st1.city="Chennai";
		System.out.println("The scholarship is : "+st1.calculateScholarship());
		StudentOne st2=new StudentOne();
		st2.marks=70;
		st2.st_class=11;
		st2.city="Delhi";
		System.out.println("The scholarship is : "+st2.calculateScholarship());
		StudentOne st3=new StudentOne();
		st3.marks=20;
		st3.st_class=11;
		st3.city="Chennai";
		System.out.println("The scholarship is : "+st3.calculateScholarship());
	}

}
