package org.switchcase;

import java.util.Scanner;

public class Switchcase1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the ID number");
		int ID = sc.nextInt();
		
		switch (ID) {
		case 1:
			System.out.println("The vachicle is cycle");
			break;
			
		case 2:
			System.out.println("The vachicle is Bike");
			break;
			
		case 3:
			System.out.println("The vachicle is car");
			break;
			
		case 4:
			System.out.println("The vachicle is train");
			break;
			
		case 5:
			System.out.println("The vachicle is Flight");
			break;

		default:
			System.out.println("Invalid ID");
			break;
		}
		
		sc.close();
	}
}
