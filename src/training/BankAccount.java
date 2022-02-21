package training;

public class BankAccount {

	String name;
	double balance;
	double interestRate;
	
	public BankAccount(String name) {
		this.name=name;
		
	}
	String name() {
		return name;
	}
	double balance() {
		return balance;
	}
	double rate() {
		return interestRate;
	}
	void deposit(double amount ) {
		balance =(double)balance+amount;
	}
	void withdraw(double amount) {
		balance =(double)balance-amount;
	}
	void setRate(double rate) {
		this.interestRate=rate;
	}
	void monthly_update() {
		double adjustBy = computeInterest() - computeFees();
		
		balance += adjustBy;
	}
	double computeInterest() {
		double monthRate = interestRate/12;
		double interest = balance * monthRate;
		interest = Math.max(0.0, interest);
		return interest;
	}
	double computeFees() {
		double tenPercent = Math.max(0.0, balance * .1);
		double fee = Math.min(10.00, tenPercent);
		return fee;
	}
	@Override
	public String toString() {
		return "Name : "+this.name+", Balance : "+this.balance+", Interest Rate : "+this.interestRate;
	}
}
