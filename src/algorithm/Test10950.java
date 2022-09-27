package algorithm;

import java.util.Scanner;

public class Test10950 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int[] ar = new int[a];
		int[] ar2 = new int[a];
		
		
		for (int i = 1; i <= a; i++) {
			int b = s.nextInt();
			int c = s.nextInt();
			ar[i-1] = b;
			ar2[i-1] = c;
		}
		for (int i = 0; i < a; i++) {
			System.out.println(ar[i]+ar2[i]);
		}
		
	}

}
