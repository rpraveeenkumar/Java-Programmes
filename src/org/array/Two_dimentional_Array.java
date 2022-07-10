package org.array;

public class Two_dimentional_Array {
	public static void main(String[] args) {
	
	int a[][] = new int[3][4];
	a[0][0]=0;
	a[0][1]=1;
	a[0][2]=2;
	a[0][3]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	a[1][3]=7;
	a[2][0]=8;
	a[2][1]=9;
	a[2][2]=10;
	a[2][3]=11;
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+"  ");
			
		}
		System.out.println();
	}
	
	
	}
}
