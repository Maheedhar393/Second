package com.Emp;

public class EmployeeSalaryInfo {
	
	int empId;
	double salCal;
	String empName;
	void setEmpId(int empId) {
		this.empId=empId;
	}
	void setEmpName(String empName) {
		this.empName=empName;
	}
	void setSalCal(double salCal) {
		this.salCal=salCal;
	}
	int getEmpId() {
		return empId;
	}
	String getEmpName() {
		return empName;
	}
	double getSalCal() {
		return salCal;
	}
}
