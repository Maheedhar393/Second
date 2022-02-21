package training;

public class ProctectedAccount extends BankAccount{
	
	private String pin;
	ProctectedAccount(String name,String pin){
		super(name);
		this.pin=pin;
	}
	public void setPin(String pin) {
		this.pin=pin;
				
	}
	public String getPin() {
		return pin;
	}
	
}
