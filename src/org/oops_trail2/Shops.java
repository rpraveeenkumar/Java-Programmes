package org.oops_trail2;

public class Shops extends Wholesaler {
	
	public void link3() {
		
		System.out.println("Shops deliver to the customers");
		
	}
	
	public static void main(String[] args) {
		
		Shops ref3 = new Shops ();
		ref3.link1();
		ref3.link2();
		ref3.link3();
		
	}
}



