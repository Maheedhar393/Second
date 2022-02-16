package training;
abstract class RBIBank{
	void openAccountProcess() {
		System.out.println("RBI opened account");
	}
	abstract void closeAccountProcess();
}
class ABCBank extends RBIBank{
	
	void closeAccountProcess() {
		System.out.println("ABC bank closed the account");
	}
	
}
class XYZBank extends RBIBank{
	
	void closeAccountProcess() {
		System.out.println("XYZ bank closed the account");
	}
}
public class BankManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCBank a=new ABCBank();
		XYZBank x=new XYZBank();
		a.openAccountProcess();
		a.closeAccountProcess();
		x.openAccountProcess();
		x.closeAccountProcess();
	}

}
