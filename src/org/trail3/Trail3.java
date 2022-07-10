package org.trail3;

public class Trail3 {
	
	private void Emp_Name() {
		System.out.println("Emp_Name: Praveen");
	}
	private void Emp_Ph() {
		System.out.println("Emp_Ph: 9566971997");
	}
	private void Emp_Email() {
		System.out.println("Emp_Email: pk@gmail.com");
	}
	
	public static void main(String[] args) {
		
		Trail3 ref1 = new Trail3 ();
		
			ref1.Emp_Name();
			ref1.Emp_Ph();
			ref1.Emp_Email();
	}
}
