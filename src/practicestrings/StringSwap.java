package practicestrings;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Maheedhar";
		String s2="Chillapalli";
		System.out.println("Before swapping : ");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		s1=s1+s2;
		s2=s1.substring(0,9);
		s1=s1.substring(9);
		System.out.println("After swapping");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
	}

}
