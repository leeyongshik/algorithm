package algorithm;

import java.util.Scanner;

public class Test25304 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int tot = s.nextInt();
		int cnt = s.nextInt();
		int sum;
		int c = 0;

		
		for ( int i = 1; i<=cnt; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			sum = a*b;
			c+=sum;
			
			
		}
		if( c == tot) System.out.println("Yes");
		else System.out.println("No");
		
	}

}
