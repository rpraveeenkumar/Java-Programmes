package org.JumpingStatement;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i==6) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
