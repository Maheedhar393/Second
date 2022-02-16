package com.demo.tax;

public class Student {
	int marks,st_class;
	int calculateScholarship() {
		int scholarShip=0;
		switch(st_class) {
		case 10:
			scholarShip=(int)marks*15000/100;
			break;
		case 11:
			scholarShip=(int)marks*25000/100;
			break;
		case 12:
			scholarShip=(int)marks*30000/100;
		    break;
		default:
			scholarShip=(int)marks*15000/100;
		}
		return scholarShip;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		st1.marks=80;
		st1.st_class=10;
		System.out.println("The scholarship is : "+st1.calculateScholarship());
		Student st2=new Student();
		st2.marks=60;
		st2.st_class=12;
		System.out.println("The scholarship is : "+st2.calculateScholarship());
		Student st3=new Student();
		st3.marks=30;
		st3.st_class=11;
		System.out.println("The scholarship is : "+st3.calculateScholarship());
		Student st4=new Student();
		st4.marks=30;
		st4.st_class=12;
		System.out.println("The scholarship is : "+st4.calculateScholarship());
	}

}
