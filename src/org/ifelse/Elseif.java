package org.ifelse;

import java.util.Scanner;

public class Elseif {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark = sc.nextInt();
		
		if (mark<35) {
			System.out.println("E Grade");
		}
		
		else if (mark>=35 && mark<50) {
			System.out.println("D Grade");
			
		}
		
		else if (mark>=50 && mark<65) {
			System.out.println("C Grade");
			
		}
		
		else if (mark>=65 && mark<80) {
			System.out.println("B Grade");
			
		}
		
		else if (mark>=80 && mark<95) {
			System.out.println("A Grade");
			
		}
		
		else if (mark>=95 && mark<100) {
			System.out.println("S Grade");
			
		}
		sc.close();
	}

}
