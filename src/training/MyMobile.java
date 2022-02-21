package training;

public class MyMobile{
	
	public static void main(String args[]) {
		Apple a= new Apple("Apple", 500,"ios", 5,8,32);
		Samsung s=new Samsung("samsung",500,"Android",9,8,64);
		System.out.println("Company : "+a.getCompany()+", OS : "+a.getOS());
		System.out.println("Company : "+s.getCompany()+", OS : "+s.getOS());
	}
}