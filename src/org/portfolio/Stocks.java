package org.portfolio;

public class Stocks {

	private void stock_details() {
		System.out.println("Stock details");
	}
	
	private void stock_details(String name) {
		System.out.println("Stock name is:"+name);
	}
	
	private void stock_details(int qty) {
		System.out.println("Stock qty is:"+qty);
	}
	
	private void stock_details(int m1, float m2) {
		System.out.println("buy price and CMP:"+m1+"and"+m2);
	}
	
	private void stock_details(long value) {
		System.out.println("total holding value"+value);
	}
	
	private void stock_details(int num, char up) {
		System.out.println("Stock gain: "+num+""+up);
	}
	
	public static void main(String[] args) {
		Stocks s = new Stocks();
		s.stock_details();
		s.stock_details(5);
		s.stock_details(50);
		s.stock_details(500005l);
		s.stock_details(10, 5.8f);
		s.stock_details(3, '%');
		s.stock_details("infy");
		
				
	}
		
	
}

