package com.Emp;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryCalculator sal=new SalaryCalculator();
		EmployeeInfo emp=new EmployeeInfo();
		emp.setEmpId(145);
		emp.setEmpName("Mahee");
		emp.setNoOfdayWorked(25);;
		emp.setNoOfHolidays(5);
		emp.setPayPerDay(3000);
		emp.setSpAllowance(500);;
		emp.setTaxPercentage(10);
		EmployeeSalaryInfo em=sal.calculateSalary(emp);
		System.out.println("Employee name : "+em.getEmpId());
		System.out.println("Employee ID : "+em.getEmpName());
		System.out.println("Employee salary : "+em.getSalCal());
		
	}

}
