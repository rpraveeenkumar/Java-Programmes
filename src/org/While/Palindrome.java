package org.While;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int rem=0;
		int ans=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Print a number");
		int num = sc.nextInt();
		int a=num;
		
		while (num>0) {
			rem=num%10;
			ans=(ans*10)+rem;
			num=num/10;
			
			
		}
		
		if (a==ans) {
			System.out.println("It is Palindrome number");
		}
		else {
			System.out.println("It is not Palindrome number");
		}
		sc.close();
	}

}
