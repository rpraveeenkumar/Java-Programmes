package org.switchcase;

public class Switchcase {
	
	public static void main(String[] args) {
	
		
		int i=1;
		switch (i) {
		
		case 'a':
			System.out.println("This is land case");
			
			break;
			
		case 1:
		System.out.println("This is murder case");
		break;
		
		case 2:
			System.out.println("This is theft case");
			break;
			
		case 3:
			System.out.println("This is violance case");
			break;
			
		case 4:
			System.out.println("This is licence case");
			break;
			
		case 5:
			System.out.println("This is accident case");
			break;

		default:
			System.out.println("The case id is invalid");
			break;
		}
	}

}
