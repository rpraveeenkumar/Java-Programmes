package org.nested_forloop;

public class Star3 {
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
		
			for (int j = 4-i ; j > 0; j--) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
	}
	
	

}
