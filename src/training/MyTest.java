package training;

 abstract class MyTest {

	 abstract void calculate();
	
	
}
class Addition extends MyTest{
	int a,b;
	Addition(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public void calculate() {
		System.out.println("the addition is : "+(a+b));
	}
	
}

class Substraction extends MyTest{
	int a,b;
	Substraction(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public void calculate() {
		System.out.println("the Substraction is : "+(a-b));
	}
}

class Multiplication extends MyTest{
	int a,b;
	Multiplication(int a,int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public void calculate() {
		System.out.println("the multiplication is : "+(a+b));
	}
}