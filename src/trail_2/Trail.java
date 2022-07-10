package trail_2;

import org.For.Forloop_eg1;

public class Trail extends Forloop_eg1 {
	
	public static void main(String[] args) {
		
		Forloop();
		
		for (int j = 0; j < 5; j++) {
			
			for (int k = 4 - j; k > 0; k--) {
				
				System.out.print(" ");
				
			}
			
			for (int m = 0; m <= j; m++) {
				int a=j+1;
				System.out.print(a+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
