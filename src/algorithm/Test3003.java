package algorithm;

import java.util.Scanner;

public class Test3003 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int f = s.nextInt();
		
		if (a==1) System.out.println(0);
		else System.out.println(1-a);
		
		if (b==1) System.out.println(0);
		else System.out.println(1-b);
		
		if (c==2) System.out.println(0);
		else System.out.println(2-c);
		
		if (d==2) System.out.println(0);
		else System.out.println(2-d);
		
		if (e==2) System.out.println(0);
		else System.out.println(2-e);
		
		if (f==8) System.out.println(0);
		else System.out.println(8-f);
		
		
	}

}
