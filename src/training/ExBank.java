package training;

abstract class Bank{
	abstract double getRateOfInterest();
}
class SBI extends Bank{
	double rateOfInterest;
	public SBI(double rateOfInterest) {
		this.rateOfInterest=rateOfInterest;
	}
	@Override
	public double getRateOfInterest() {
		return rateOfInterest;
	}
}
class HDFC extends Bank{
	double rateOfInterest;
	public HDFC(double rateOfInterest) {
		this.rateOfInterest=rateOfInterest;
	}
	@Override
	public double getRateOfInterest() {
		return rateOfInterest;
	}
}
public class ExBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI(4.5);
		System.out.println("the rate of interest in SBI bank is : "+b.getRateOfInterest());
		b=new HDFC(3.5);
		System.out.println("the rate of interest in HDFC bank is : "+b.getRateOfInterest());
		
	}

}
