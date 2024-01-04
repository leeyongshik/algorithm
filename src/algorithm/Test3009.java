package algorithm;

import java.util.Scanner;

public class Test3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int f = s.nextInt();
		
		int g = 0;
		int h = 0;
		
		if(a == c) {
			g = e;
		}else if( a == e) {
			g = c;
		}else {
			g = a;
		}
		
		if(b == d) {
			h = f;
		}else if( b == f) {
			h = d;
		}else {
			h = b;
		}
		
		System.out.println(g + " " + h);
	}

}
