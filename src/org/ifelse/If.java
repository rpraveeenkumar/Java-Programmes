package org.ifelse;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age>18) {
			
			System.out.println("you are an adult");
			
		}
		
		sc.close();
	}

}
