package org.While;

import java.util.Scanner;

public class Amstrong_num {
	
	public static void main(String[] args) {
		
		int rem=0;
		int ans=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three digit number");
		int n=sc.nextInt();
		int a=n;
		
		while (n>0) {
			
			rem=n%10;
			ans=ans+(rem*rem*rem*rem);
			n=n/10;
			
		}
		
		if (ans == a) {
			
			System.out.println("It is an amstrong number");
		}
		
		else{
			System.out.println("It is not an amstrong number");
		}
		sc.close();
	}

}
