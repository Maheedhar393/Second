package com.Emp;

public class SalaryCalculator {

	EmployeeSalaryInfo calculateSalary(EmployeeInfo emp) {
		double sal=(double)(emp.getPayPerDay()*emp.getNoOfdayWorked()+emp.getSpAllowance()*emp.getNoOfHolidays())*emp.getTaxPercentage()/100;
		EmployeeSalaryInfo em=new EmployeeSalaryInfo();
		em.setEmpId(emp.getEmpId());
		em.setEmpName(emp.getEmpName());
		em.setSalCal(sal);
		return em;
	}
}
