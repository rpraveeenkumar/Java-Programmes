package org.ifelse;

import java.util.Scanner;

public class Else {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num % 2==0) {
			
			System.out.println("This is an even number");
			
		} else {
			
			System.out.println("This is an odd number");

		}
		sc.close();
	}

}
