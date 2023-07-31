package algorithm;

import java.util.Scanner;

public class Test2903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = 1;
		int c = 1;
		for(int i=1; i<= a; i++) {
			c *= 2;
		}
		b += c;
		System.out.println(b*b);
		
		
	}

}
