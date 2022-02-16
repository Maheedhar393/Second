package training;
class Goods{
	String city;
	double vat;
	int price;
	Goods(String city,int price){
		this.city=city;
		this.price=price;
	}
	void calcVat() {
		if(city.equals("chennai")) {
			vat=(double)2.5*price/100;
		}
		else if(city.equals("mumbai")){
			vat=(double)1.5*price/100;
		}
		System.out.println("The VAT tax for this good is : "+vat);
	}
}
class PerishableGoods extends Goods{
	double salesTax;
	PerishableGoods(String city,int price) {
		super(city,price);
	}
	void calcSalesTax() {
		if(city.equals("chennai")) {
			salesTax=(double)10*price/100+5;
		}
		else if(city.equals("mumbai")) {
			salesTax=(double)15*price/100+25;
		}
		System.out.println("The Sales tax for this Perishable good is : "+salesTax);
	}

}
class NonPerishableGoods extends Goods{
	double salesTax;
	NonPerishableGoods(String city,int price) {
		super(city,price);
	}
	void calcSalesTax() {
		if(city.equals("chennai")) {
			salesTax=(double)5*price/100-5;
		}
		else if(city.equals("mumbai")) {
			salesTax=(double)25*price/100-10;
		}
		System.out.println("The Sales tax for this NonPerishable good is : "+salesTax);
	}

}
public class TaxCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerishableGoods pg=new PerishableGoods("chennai",1000);
		pg.calcVat();
		pg.calcSalesTax();
		NonPerishableGoods np=new NonPerishableGoods("mumbai", 2000);
		np.calcVat();
		np.calcSalesTax();
	}

}
