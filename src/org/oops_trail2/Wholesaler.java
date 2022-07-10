package org.oops_trail2;

public class Wholesaler extends Farmer {
	
	public void link2() {
System.out.println("wholesaler sells large qty");
	}

	public static void main(String[] args) {
		Wholesaler ref = new Wholesaler ();
		ref.link1();
		ref.link2();
	}
}
