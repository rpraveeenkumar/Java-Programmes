package org.For;

public class Star_Pattern {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = i-4; j < 0; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
