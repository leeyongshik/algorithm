package algorithm;

import java.util.Scanner;

public class Test2439 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for (int j=1; j<=a;j++) {
			
			for (int k = a-1;k>=j;k--) {
				System.out.print(" ");
			}
			
			for (int i = 1;i<=j;i++) {
				System.out.print("*");
			
			
		}
			System.out.println();
		
		}

	}

}
