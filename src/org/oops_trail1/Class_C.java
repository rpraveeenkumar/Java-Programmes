package org.oops_trail1;

public class Class_C extends Class_B {

	private void property_3() {

		System.out.println("This is farm property");
	}
	
	public static void main(String[] args) {
		Class_C ref1 = new Class_C ();
		ref1.property_1();
		ref1.property_2();
		ref1.property_3();
	}
}
